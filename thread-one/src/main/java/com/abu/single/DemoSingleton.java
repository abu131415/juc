package com.abu.single;

public class DemoSingleton {

    private DemoSingleton() {
        System.out.println("实例被初始化了！！");
    }

    private static DemoSingleton demoSingleton;

    public static DemoSingleton getDemoSingleton() {
        if (demoSingleton == null) {
            demoSingleton = new DemoSingleton();
        }
        return demoSingleton;
    }

    public static void main(String[] args) {

//        DemoSingleton demoSingleton = DemoSingleton.getDemoSingleton();
//        DemoSingleton demoSingleton01 = DemoSingleton.getDemoSingleton();
//        DemoSingleton demoSingleton02 = DemoSingleton.getDemoSingleton();
//      线程不安全
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                DemoSingleton.getDemoSingleton();
            }).start();
        }
    }

}
