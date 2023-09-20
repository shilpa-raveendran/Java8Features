package com.shilpa.java8Demo;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierDemo {

    public static void main(String[] args) {

        Supplier<Date> date = () -> new Date();
        System.out.println(date.get());
    }
}
