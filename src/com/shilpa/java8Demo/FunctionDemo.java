package com.shilpa.java8Demo;

import java.util.function.Function;

public class FunctionDemo {

    public static void main(String[] args) {

        //Function<T,R> :- define both return type and input type
        //returns a string
        Function<String, String> funct = s-> s.substring(2);
        System.out.println(funct.apply("Hello World"));

        //returns an integer
        Function<String,Integer> functInt = s-> s.lastIndexOf("World");
       System.out.println(functInt.apply("Hello World"));
    }
}
