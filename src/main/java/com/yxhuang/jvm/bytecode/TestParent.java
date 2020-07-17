package com.yxhuang.jvm.bytecode;

public class TestParent {

    static int sleep = (int)(Math.random() * 3.0);

    static final  int touch = (int)(Math.random() * 2.0);

    static {
        System.out.println("TestParent was initialized");
    }
}
