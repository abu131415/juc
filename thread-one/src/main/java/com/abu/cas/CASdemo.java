package com.abu.cas;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 比较并交换
 */
public class CASdemo {

    public static void main(String[] args) {

        AtomicInteger atomicInteger = new AtomicInteger(5);
        boolean flag = atomicInteger.compareAndSet(5, 100);
        System.out.println(flag);
        System.out.println(atomicInteger.get());

        System.out.println("===========");

        boolean flag02 = atomicInteger.compareAndSet(5, 2020);
        System.out.println(flag02);
        System.out.println(atomicInteger.get());
    }
}
