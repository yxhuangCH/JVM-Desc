package com.yxhuang.jvm.classloader;

import java.io.IOException;
import java.io.InputStream;

public class ClassLoaderTest {


    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        ClassLoader myLoader = new ClassLoader() {
            @Override
            public Class<?> loadClass(String name) throws ClassNotFoundException {

                try {
                    String fileName = name.substring(name.lastIndexOf(".") + 1) + ".class";
                    InputStream is = getClass().getResourceAsStream(fileName);
                    if (is == null){
                        super.loadClass(name);
                    }
                    byte[] b = new byte[is.available()];
                    is.read(b);
                    return defineClass(name, b, 0, b.length);
                } catch (Exception e) {
                    e.printStackTrace();
//                    throw new ClassNotFoundException();
                    return super.loadClass(name);
                }
            }
        };


        Object obj = myLoader.loadClass("com.yxhuang.jvm.classloader.ClassLoaderTest").newInstance();

        System.out.println("obj class： " + obj.getClass());
        System.out.println("obj class instanceof： " + (obj instanceof ClassLoaderTest));

    }
}
