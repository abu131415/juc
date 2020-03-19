package com.abu.lock;

/**
 * 可重入锁：同一个线程可以进入任何一个它已经获取锁所同步的代码
 * 同一个线程中外层方法获取锁后，进入内层方法可以自动获取锁
 */
public class SynchronizedDemo {

    public static synchronized void method01() {
        System.out.println("method01开始执行");
        method02();
    }

    public static synchronized void method02() {
        System.out.println("method02开始执行");
    }

    public static void main(String[] args) {
        new Thread(() -> {
           method01();
        }, "0001").start();
    }
}
