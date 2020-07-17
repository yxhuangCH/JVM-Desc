package com.yxhuang.jvm.bytecode.methodhandle;

import jdk.nashorn.internal.lookup.Lookup;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

public class MethodHandleTest {


    static class ClassA {

        public void println(String s) {
            System.out.println(s);
        }
    }


    public static void main(String[] args) throws Throwable {
        Object object = System.currentTimeMillis() % 2 == 0 ? System.out : new ClassA();
        getPrintlnMH(object).invokeExact("icyfenix");
    }


    private static MethodHandle getPrintlnMH(Object reveiver) throws NoSuchMethodException, IllegalAccessException {
        MethodType mt = MethodType.methodType(void.class, String.class);
        return MethodHandles.lookup().findVirtual(reveiver.getClass(), "println", mt).bindTo(reveiver);
    }
}
