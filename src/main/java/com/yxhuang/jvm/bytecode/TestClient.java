package com.yxhuang.jvm.bytecode;

public class TestClient {
    static {
        System.out.println("TestClient was initialized");
    }

    public static void main(String[] args){
        int hours = TestChild.sleep;
        System.out.println("TestClient hours: " + hours);

    }
}
