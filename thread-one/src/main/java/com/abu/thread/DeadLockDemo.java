package com.abu.thread;

import java.util.concurrent.TimeUnit;

public class DeadLockDemo implements Runnable {

    private String one;
    private String two;

    public DeadLockDemo(String one, String two) {
        this.one = one;
        this.two = two;
    }

    @Override
    public void run() {

        synchronized (one) {
            System.out.println(Thread.currentThread().getName() + "持有" + one + "，尝试获取" + two);

            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (two) {
                System.out.println(Thread.currentThread().getName() + "持有" + one + "，尝试获取" + two);
            }
        }


    }
}
