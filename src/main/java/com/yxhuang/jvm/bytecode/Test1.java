package com.yxhuang.jvm.bytecode;

public class Test1 {

    private Object lock = new Object();

    public static int zize = 123;

    private Test1 mTest1;

    static String tag;

    static {
        tag = "abc";
    }

    private int a = 1;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void test(int a){
        synchronized (lock){
            this.a = a;
        }
    }

    public synchronized void test2(){

    }

    public boolean setObject(Object object){
        mTest1 = (Test1) object;
        return true;
    }



}
