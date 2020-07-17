package com.yxhuang.jvm.bytecode;

public class TestChild extends TestParent {

    static int crying = 1 + (int)(Math.random() * 2.0);

    static {
        System.out.println("TestChild was initialized.");
    }
}
