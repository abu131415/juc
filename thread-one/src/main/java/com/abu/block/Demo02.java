package com.abu.block;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

public class Demo02 {
    public static void main(String[] args) throws InterruptedException {
        ArrayBlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(3);
        System.out.println(blockingQueue.offer("a", 3, TimeUnit.SECONDS));
        System.out.println(blockingQueue.offer("a", 3, TimeUnit.SECONDS));
        System.out.println(blockingQueue.offer("a", 3, TimeUnit.SECONDS));
        System.out.println(blockingQueue.offer("a", 3, TimeUnit.SECONDS));
    }
}
