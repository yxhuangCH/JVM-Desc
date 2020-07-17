package com.yxhuang.jvm.classloader;

import java.sql.Driver;
import java.util.Iterator;
import java.util.ServiceLoader;

public class ThreadClassLoaderTest {


    public static void main(String[] args){
        ServiceLoader<Driver> loader = ServiceLoader.load(Driver.class);
        Iterator<Driver> iterator = loader.iterator();

        while (iterator.hasNext()){
            Driver driver = iterator.next();

            System.out.println("driver: " + driver.getClass() + " ,loader: " + driver.getClass().getClassLoader());

        }

        System.out.println("当前线程上下文类加载器： " + Thread.currentThread().getContextClassLoader());
        System.out.println("ServiceLoader 类加载器： " + ServiceLoader.class.getClassLoader());


    }






}
