package com.abu.cas;

import lombok.AllArgsConstructor;
import lombok.Setter;

import java.util.concurrent.atomic.AtomicReference;

/**
 * 对某个类进行原子引用包装
 */


@Setter
@AllArgsConstructor
class User {
    private String name;
    private Integer age;
}

public class AtomicReferenceDemo {
    public static void main(String[] args) {

        User user = new User("张三", 16);
        User user02 = new User("李四", 19);
        AtomicReference<User> atomicReference = new AtomicReference<>();

        atomicReference.set(user);
        System.out.println(atomicReference.compareAndSet(user,user02)+"******"+atomicReference.get());     //true，替换成了user02
        System.out.println("============");
        System.out.println(atomicReference.compareAndSet(user,user02)+"******"+atomicReference.get());      //false，还是user02
    }


}
