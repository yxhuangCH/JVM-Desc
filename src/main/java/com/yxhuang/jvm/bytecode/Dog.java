package com.yxhuang.jvm.bytecode;

public class Dog {

    private void interestingMethod(){
        System.out.println("Dog interestingMethod");
    }

    void exampleMethod(){
        interestingMethod();
    }

    void someMethod(){
        System.out.println("Dog someMethod");

    }


}

class CockerSpancial extends Dog{


    public static void main(String args[]){
        CockerSpancial bootsise = new CockerSpancial();
        bootsise.exampleMethod();

        bootsise.someMethod();
    }


    void interestingMethod(){
        System.out.println("CockerSpancial interestingMethod");
    }

    
    void someMethod(){
        super.someMethod();
    }




}
