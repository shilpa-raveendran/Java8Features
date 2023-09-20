package com.shilpa.java8Demo;

import java.util.Random;
import java.util.function.Function;

public class FunctionalChainingDemo {

    public static void main(String[] args) {

        Random rand = new Random();
        Integer input= rand.nextInt(1,10);

        Function<Integer,Integer> f1 = i -> i*i;
        Function<Integer,Integer> f2 = i -> i*2;
        System.out.println("The square of "+input+" is: "+f1.apply(input));

        System.out.println("Double the Sqaured value: "+f1.andThen(f2).apply(input));
        System.out.println("Compose first f2 and then f1: "+f1.compose(f2).apply(input));

    }
}
