package com.abu.block;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockQueueDemo {

    public static void main(String[] args) {
        BlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<>(5);
//        System.out.println(blockingQueue.add(1));
//        System.out.println(blockingQueue.add(2));
//        System.out.println(blockingQueue.add(3));
//        System.out.println(blockingQueue.add(4));
//        System.out.println(blockingQueue.add(5));
////        blockingQueue.remove();
//        System.out.println(blockingQueue.element());

        blockingQueue.offer(1);
        blockingQueue.offer(1);
        blockingQueue.offer(1);
        blockingQueue.offer(1);
        blockingQueue.offer(1);
        System.out.println(blockingQueue.offer(1));
        System.out.println("============");
        System.out.println(blockingQueue.poll());
        System.out.println(blockingQueue.poll());
        System.out.println(blockingQueue.poll());
        System.out.println(blockingQueue.poll());
        System.out.println(blockingQueue.poll());
        System.out.println(blockingQueue.poll());
    }
}
