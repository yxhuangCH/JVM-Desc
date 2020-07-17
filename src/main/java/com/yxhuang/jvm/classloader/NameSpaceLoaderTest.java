package com.yxhuang.jvm.classloader;

import java.lang.reflect.Method;

/**
 * 命名空间测试
 */
public class NameSpaceLoaderTest {

    public static void main(String[] arg) throws Exception {
        MyClassLoader classLoader1 = new MyClassLoader("classloader1");
        MyClassLoader classLoader2 = new MyClassLoader("classloader2");


        classLoader1.setPath("/Users/yxhuang/Desktop/");
        classLoader2.setPath("/Users/yxhuang/Desktop/");

        Class<?> class1 = classLoader1.loadClass("com.yxhuang.jvm.classloader.Person");
        Class<?> class2 = classLoader2.loadClass("com.yxhuang.jvm.classloader.Person");


        System.out.println("class1 : " + class1.getSimpleName() + " " +  class1.getClassLoader().toString());

        System.out.println("class2 : " + class2.getSimpleName() + " " +  class2.getClassLoader().toString());

        System.out.println(class1 == class2);



        Object object1 = class1.newInstance();
        Object object2 = class2.newInstance();

        Method method = class1.getMethod("setPerson", Object.class);
        method.invoke(object1, object2);

    }
}
