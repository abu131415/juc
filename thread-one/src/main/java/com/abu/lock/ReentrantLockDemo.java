package com.abu.lock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 可重入锁：同一个线程可以进入任何一个它已经获取锁所同步的代码
 * 同一个线程中外层方法获取锁后，进入内层方法可以自动获取锁
 */
public class ReentrantLockDemo {

    public static void main(String[] args) {
        new Thread(new MyRunnable()).start();
    }

    static class MyRunnable implements Runnable {

        ReentrantLock lock = null;
//        同一个线程可以进入任何一个它已经获取锁
        public void set() {
            lock.lock();
            try {
                System.out.println(Thread.currentThread().getName());
//        所同步的代码
                get();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }

        public void get() {
            lock.lock();
            try {
                System.out.println(Thread.currentThread().getName());
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }

        @Override
        public void run() {
            lock = new ReentrantLock();
            set();
        }
    }

}
