package com.abu.lock;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierDemo {

    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(10, () -> {
            System.out.println("执行结束了");
        });

        for (int i = 0; i < 10; i++) {
            final int j = 0;
            new Thread(() -> {
                System.out.println(Thread.currentThread().getName() + j);
                try {
//                    先来到的先阻塞
                    cyclicBarrier.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }

}
