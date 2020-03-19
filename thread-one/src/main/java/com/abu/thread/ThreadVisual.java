package com.abu.thread;

import java.util.concurrent.TimeUnit;

public class ThreadVisual {

    public static void main(String[] args) {
        One one = new One();
        new Thread(() -> {
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            one.add();
            System.out.println(Thread.currentThread().getName() + "==" + one.num);
        }).start();

        while (one.num==0){

        }

        System.out.println(Thread.currentThread().getName()+"thread is over");
    }
}
