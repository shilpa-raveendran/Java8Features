package com.shilpa.java8Demo;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiPredicateBiFunctionDemo {
    public static void main(String[] args) {

        BiPredicate<Integer, Integer> biPredicate= (i,j) -> i+j >=5;
        System.out.println(biPredicate.test(3,7));
        System.out.println(biPredicate.test(1,1));

        BiFunction<Integer, Integer,Integer> biFunction= (i, j) -> i+j ;
        System.out.println(biFunction.apply(3,7));
        System.out.println(biFunction.apply(1,1));



    }
}
