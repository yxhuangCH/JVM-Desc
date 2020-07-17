package com.yxhuang.jvm.classloader;

import java.io.*;

public class MyClassLoader extends ClassLoader {


    private String className;
    private String path;

    public MyClassLoader() {
    }

    public MyClassLoader(String className) {
        this.className = className;
    }

    public MyClassLoader(ClassLoader parent, String className) {
        super(parent);
        this.className = className;
    }

    public void setPath(String path){
        this.path = path;
    }

    @Override
    protected Class findClass(String className) throws ClassNotFoundException {
        System.out.println("findClass className: " + className);
        byte[] classData;

        classData = getTypeFromBasePath(className);
        if (classData == null){
            throw new ClassNotFoundException();
        }

        // Parse it
        return defineClass(className, classData, 0, classData.length);
    }


    private byte[] getTypeFromBasePath(String typeName){
        FileInputStream fis;
        String fileName = path  + typeName.replace('.', File.separatorChar) + ".class";
        System.out.println("getTypeFromBasePath fileName :" + fileName);

        try {
            fis = new FileInputStream(fileName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return  null;
        }

        BufferedInputStream bis = new BufferedInputStream(fis);
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        try {
            int c = bis.read();
            while ( c != -1){
                out.write(c);
                c = bis.read();
            }

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

        return out.toByteArray();
    }
}
