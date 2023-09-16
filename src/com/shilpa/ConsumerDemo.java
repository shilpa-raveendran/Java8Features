package com.shilpa;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {

        //it takes one input but return type is void thereffore we cannot write normal lambda exp

        Consumer<Integer> c1 = i -> System.out.println("Return nothing "+ i* i);
        c1.accept(5);

    }
}
