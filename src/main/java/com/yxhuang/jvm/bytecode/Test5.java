package com.yxhuang.jvm.bytecode;

public class Test5 {


    public void sayHello(Human human) {
        System.out.println("Hello human");
    }

    public void sayHello(Man man) {
        System.out.println("Hello man");
    }

    public void sayHello(Woman woman) {
        System.out.println("Hello woman");
    }


    public static void main(String[] args) {
        Human man = new Man();
        Human woman = new Woman();

        Test5 test5 = new Test5();
        test5.sayHello(man);
        test5.sayHello(woman);
    }
}


interface Human {

}

class Man implements Human {

}

class Woman implements Human {

}
