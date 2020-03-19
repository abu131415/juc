package com.abu.single;

public class DemoSingleton {

    //    禁止指令重排
    private volatile static DemoSingleton demoSingleton;

    private DemoSingleton() {
        System.out.println("实例被初始化了！！");
    }

    /**
     * 双重检锁机制
     * @return
     */
    public static DemoSingleton getDemoSingleton() {
        if (demoSingleton == null) {
            synchronized (DemoSingleton.class) {
                if (demoSingleton == null) {
                    demoSingleton = new DemoSingleton();
                }
            }
        }
        return demoSingleton;
    }

    public static void main(String[] args) {

//        DemoSingleton demoSingleton = DemoSingleton.getDemoSingleton();
//        DemoSingleton demoSingleton01 = DemoSingleton.getDemoSingleton();
//        DemoSingleton demoSingleton02 = DemoSingleton.getDemoSingleton();
//      线程不安全
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                DemoSingleton.getDemoSingleton();
            }).start();
        }
    }

}
