package com.shilpa;

@FunctionalInterface
public interface FunctionalInterfaceDemo {
    public void abstractMethod();
    default void printName(){
        System.out.println("Hello Shilpa");
    }
}
