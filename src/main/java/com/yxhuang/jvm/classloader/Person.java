package com.yxhuang.jvm.classloader;

public class Person {

    private Person person;

    public Person() {
    }

    public void setPerson(Object object){
        System.out.println("setPerson " + object.getClass().getSimpleName());
        this.person = (Person) object;

    }
}
