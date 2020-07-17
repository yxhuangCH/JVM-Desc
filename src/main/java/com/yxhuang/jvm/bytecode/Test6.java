package com.yxhuang.jvm.bytecode;

import com.yxhuang.jvm.classloader.MyClassLoader;

public class Test6 {


    public static void main(String[] args) throws Exception {
        //  loadClass
        MyClassLoader loader1 = new MyClassLoader("loader1");

        loader1.setPath("/Users/yxhuang/Desktop/");

        Class<?> clazz = loader1.loadClass("com.yxhuang.jvm.bytecode.Test1");
        System.out.println("class name: " + clazz.getSimpleName() + " \nclass hashcode: " + clazz.hashCode() + " \nloader: " + clazz.getClassLoader().getClass().getSimpleName());
        Object object1 = clazz.newInstance();
        System.out.println(object1);

        System.out.println("-------------------------------");
//
        MyClassLoader loader2 = new MyClassLoader(loader1, "loader2");
        loader2.setPath("/Users/yxhuang/Desktop/");
        Class<?> clazz2 = loader2.loadClass("com.yxhuang.jvm.bytecode.Test1");
        System.out.println("class name: " + clazz.getSimpleName() + " \nclass hashcode: " + clazz.hashCode() + " \nloader: " + clazz.getClassLoader().getClass().getSimpleName());
        Object object2 =  clazz2.newInstance();
        System.out.println(object2 );
//
//
//        System.out.println(object1.equals(object2));
//
//
//
//        MyClassLoader loader3 = new MyClassLoader("loader3");
//        loader3.setPath("/Users/yxhuang/Desktop/");
//        Class<?> clazz3 = loader3.loadClass("com.yxhuang.jvm.bytecode.Test1");
//        System.out.println("class: " + clazz3.hashCode());
//        Object object3 = clazz3.newInstance();
//        System.out.println(object3);
    }
}
