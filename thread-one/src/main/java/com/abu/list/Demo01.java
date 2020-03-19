package com.abu.list;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class Demo01 {
    public static void main(String[] args) {
//        List<String> list = new CopyOnWriteArrayList<>();
//        CopyOnWriteArraySet<String> set = new CopyOnWriteArraySet<>();
        ConcurrentHashMap<String, String>  map =new ConcurrentHashMap<>();
        for (int i = 0; i < 30; i++) {
            new Thread(() -> {
                map.put(Thread.currentThread().getName(), UUID.randomUUID().toString().substring(0, 8));
                System.out.println(map);
            }).start();
        }

        HashSet<String> set =new HashSet<>();
    }



}
