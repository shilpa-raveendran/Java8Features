package com.shilpa.java8Demo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        //Get all elements from list greater than 15;

        List<Integer> list1 = new ArrayList<>();
        list1.add(5);
        list1.add(6);
        list1.add(25);
        list1.add(17);
        list1.add(4);
        //Without stream
        StreamDemo.printNewList(StreamDemo.findElements(list1));
        System.out.println();
        System.out.println("=======With Stream: filter======");

        //With Stream

        List<Integer> newList = new ArrayList<>();
        newList = list1.stream().filter(i -> i >= 15).collect(Collectors.toList());
        newList.forEach(i -> System.out.print(i + " "));
        System.out.println();

        System.out.println("=======Count method=======");
        System.out.println(list1.stream().filter(i -> i >= 15).count());
        System.out.println();

        //Map : double all the elments

        System.out.println("========Map operation========");
        list1.stream()
                .map(i -> i * 2)
                .collect(Collectors.toList())
                .forEach(i -> System.out.print(i + " "));
        System.out.println();

        //Sorted()
        System.out.println("========Sorted Processing========");
        list1.stream().sorted().forEach(i -> System.out.print(i + " "));
        System.out.println();
        list1.stream().sorted(Comparator.reverseOrder()).forEach(i -> System.out.print(i + " "));
        System.out.println();
        System.out.println("========Sorted Processing in Lambda exp========");
        list1.stream().sorted(Comparator.naturalOrder()).forEach(i -> System.out.print(i + " "));
        System.out.println();

        System.out.println("========Min and Max Processing========");
        System.out.println("Min: " + newList.stream().min(Integer::compareTo).get());
        System.out.println("Max: " + newList.stream().max(Integer::compareTo).get());
        System.out.println();

        //Create an array from a stream
        //toArray() return an Object array
        System.out.println("========toArray()========");
        Object[] objArray = list1.stream().sorted().toArray();
        for (Object o : objArray) {
            System.out.print(o + " ");
        }
        System.out.println();
        //Type casting
        //Object to int array
        int[] intArray = list1.stream().filter(i -> i >= 5).mapToInt(x -> x).sorted().toArray();
        for (int i : intArray) {
            System.out.print(i + " ");
        }
        System.out.println();

        //of()
        System.out.println("======of()======");
        Stream.of("Hello World,Welcome").forEach(s -> System.out.println(s));
        System.out.println();

        //Peek()
        //can be used for debugging process
        list1.stream().filter(i -> i >= 2).map(i -> i + 2).peek(System.out::println).count();

        //reduce()
        System.out.println("Sum using reduce() = " + list1.stream().reduce(Integer::sum).get());

        //Normal Technique
        int sum = 0;
        for (Integer integer : list1) {
            sum += integer;
        }
        System.out.println("Sum using normal technique= " + sum);

        //limit
        //short circuit
        System.out.println("Limit: 2 " + list1.stream().filter(i -> i >= 5).limit(2).toList());

        System.out.println("findFirst() greater than 5: " + list1.stream().filter(i -> i > 5).findFirst().get());

        //findAll in stream
        System.out.println("findAny(): " + list1.stream().filter(i -> i >= 5).findAny().get());

        //findAll in parallel stream
        System.out.println("findAny() in parallel: " + list1.parallelStream().filter(i -> i >= 5).findAny().get());

        // boolean anyMatch(Predicate<>)
        System.out.println("anyMatch(): " + list1.stream().anyMatch(i -> i >= 50));

        // boolean allMatch(Predicate<>)
        System.out.println("allMatch(): " + list1.stream().allMatch(i -> i >= 4));

        // boolean noneMatch(Predicate<>)
        //Returns true if either no elements of the stream match the provided predicate
        // or the stream is empty,
        // otherwise false
        System.out.println("noneMatch(): " + list1.stream().noneMatch(i -> i >= 4));
        System.out.println("noneMatch(): " + list1.stream().noneMatch(i -> i >= 26));
    }

    private static void printNewList(List<Integer> list) {

        for (Integer i : list) {
            System.out.print(i + " ");
        }
    }

    private static List<Integer> findElements(List<Integer> list) {
        List<Integer> newList = new ArrayList<>();
        for (Integer i : list) {

            if (i >= 15) {
                newList.add(i);
            }
        }
        return newList;
    }
}
