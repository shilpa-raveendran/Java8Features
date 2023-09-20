package com.shilpa.java8Demo;

@FunctionalInterface
public interface FunctionalInterfaceDemo {
    public void abstractMethod();
    default void printName(){
        System.out.println("Hello Shilpa");
    }
}
