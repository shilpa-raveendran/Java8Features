package com.shilpa;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        //Get all elements from list greater than 15;

        List<Integer> list1= new ArrayList<>();
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

        List<Integer> newList= new ArrayList<>();
        newList = list1.stream().filter(i -> i>=15).collect(Collectors.toList());
        newList.forEach(i -> System.out.print(i+" "));
        System.out.println();

        System.out.println("=======Count method=======");
        System.out.println(list1.stream().filter(i -> i>=15).count());
        System.out.println();

        //Map : double all the elments

        System.out.println("========Map operation========");
        newList = list1.stream().map(i -> i *2).collect(Collectors.toList());
        newList.forEach(i -> System.out.print(i+" "));
        System.out.println();

        //Sorted()
        System.out.println("========Sorted Processing========");
        newList.stream().sorted().forEach(i -> System.out.print(i+" "));
        System.out.println();
        newList.stream().sorted(Comparator.reverseOrder()).forEach(i -> System.out.print(i+" "));
        System.out.println();
        System.out.println("========Sorted Processing in Lambda exp========");
        newList.stream().sorted((i1,i2)->i1.compareTo(i2)).forEach(i -> System.out.print(i+" "));
        System.out.println();

        System.out.println("========Min and Max Processing========");
        System.out.println("Min: "+newList.stream().min((i1,i2) -> i1.compareTo(i2)).get());
        System.out.println("Max: "+newList.stream().max(Integer::compareTo).get());
        System.out.println();

        //Create an array from a stream
        //toArray() return an Object array
        System.out.println("========toArray()========");
        Object[] objArray = newList.stream().sorted().toArray();
        for (Object o : objArray) {
            System.out.print(o+" ");
        }
        System.out.println();
        //Type casting
        //Object to int array
        int[] intArray = newList.stream().filter(i->i>=10).mapToInt(x ->x).sorted().toArray();
        for (int i : intArray){
            System.out.print(i+" ");
        }
        System.out.println();

        //of()
        System.out.println("======of()======");
        Stream.of("Hello World,Welcome").forEach(s-> System.out.println(s));
        System.out.println();
    }

    private static void printNewList(List<Integer> list) {

        for (Integer i:list) {
            System.out.print(i+" ");
        }
    }

    private static List<Integer> findElements(List<Integer> list) {
        List<Integer> newList= new ArrayList<>();
        for (Integer i:list) {

            if(i >= 15){
                newList.add(i);
            }
        }
        return newList;
    }
}
