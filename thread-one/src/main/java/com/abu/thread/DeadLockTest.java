package com.abu.thread;

public class DeadLockTest {
    public static void main(String[] args) {
        String one ="lock01";
        String two ="lock02";
        new Thread(new DeadLockDemo(one,two)).start();
        new Thread(new DeadLockDemo(two,one)).start();
    }
}
