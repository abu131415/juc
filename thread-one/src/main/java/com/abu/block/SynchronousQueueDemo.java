package com.abu.block;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

public class SynchronousQueueDemo {

    public static void main(String[] args) {
        SynchronousQueue<Integer> synchronousQueue =new SynchronousQueue<>();

        new Thread(()->{
            try {
//                添加一个元素后必须等待被消费后才能添加下一个元素，否则添加不成功
                synchronousQueue.put(1);
                System.out.println(Thread.currentThread().getName());
                synchronousQueue.put(2);
                System.out.println(Thread.currentThread().getName());
                synchronousQueue.put(3);
                System.out.println(Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(()->{
            try {
                TimeUnit.SECONDS.sleep(2);
                System.out.println(synchronousQueue.take());
                TimeUnit.SECONDS.sleep(2);
                System.out.println(synchronousQueue.take());
                TimeUnit.SECONDS.sleep(2);
                System.out.println(synchronousQueue.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
