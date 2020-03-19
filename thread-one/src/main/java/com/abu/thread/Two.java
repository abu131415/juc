package com.abu.thread;

public class Two {

//    线程可见性,及时通知其他线程,修改的内容
        volatile int num = 0;

        public void add() {
            this.num = 60;
        }
    }