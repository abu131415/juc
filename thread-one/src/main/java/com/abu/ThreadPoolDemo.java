package com.abu;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolDemo {
    public static void main(String[] args) {
//        ExecutorService pool = Executors.newFixedThreadPool(3);  //一个线程池3个固定处理线程
//        ExecutorService executorService = Executors.newSingleThreadExecutor();      //一个线程池仅有处理线程
        ExecutorService executorService = Executors.newCachedThreadPool();      //一个线程池N个处理线程

//        多个任务需要线程池进行处理
        for (int i = 0; i < 10; i++) {
            executorService.execute(()->{
                try {
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println(Thread.currentThread().getName()+"办理业务");
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    executorService.shutdown();
                }
            });
        }
    }
}
