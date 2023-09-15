package com.shilpa;

import java.util.function.Predicate;

public class PredicateFunctionDemo {
    public static void main(String[] args) {

        //Normal technique
//        PredicateFunctionDemo pfd = new PredicateFunctionDemo();
//        System.out.println(pfd.checkStringLength("Hello"));

        // check the string test using Predicate functional interface
        Predicate<String> str = s -> s.length() >= 5;
        System.out.println(str.test("Hello All"));

    }
//    public boolean checkStringLength(String s){
//        if(s.length() >= 5)
//            return true;
//        return false;
//    }
}

