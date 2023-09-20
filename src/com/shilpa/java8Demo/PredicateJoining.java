package com.shilpa.java8Demo;

import java.util.function.Predicate;

public class PredicateJoining{
    public static void main(String[] args) {

        int toCheck=5;
        System.out.println("The Number is: "+toCheck);
        Predicate<Integer> checkInt = i -> i>=5;
        System.out.println("The number is greater than 5: "+checkInt.test(toCheck));

        Predicate<Integer> checkEvenOrOdd = i -> i%2==0;
        System.out.println("Even number: "+checkEvenOrOdd.test(toCheck));

        //and method
        System.out.println("AND Result: "+checkInt.and(checkEvenOrOdd).test(toCheck));

        //OR Method
        System.out.println("OR Result: "+checkInt.or(checkEvenOrOdd).test(toCheck));

        //Negate -> can be used only with one predicate, negates the result
        System.out.println("Negate Result: "+checkInt.negate().test(toCheck));
    }
}
