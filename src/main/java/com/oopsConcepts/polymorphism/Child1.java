package com.oopsConcepts.polymorphism;

public class Child1 extends Child{
    public static void main(String[] args) {
        Child1 child1 = new Child1();
        child1.click();

        Child child = new Child();
        child.click();

        Child child2 = new Child1();
        child2.click();
    }
    @Override
    public void click(){
        System.out.println("Child1 element clicked successfully");
    }
}
