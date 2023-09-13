package com.shilpa;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerDemo {
    public static void main(String[] args) {
        List<Integer> list1= new ArrayList<Integer>();
        list1.add(5);
        list1.add(6);
        list1.add(25);
        list1.add(17);

        List<Integer> list2= new ArrayList<Integer>();

        list2.add(5);
        list2.add(6);
        list2.add(25);
        list2.add(17);

//        list2.add(1);
//        list2.add(2);
//        list2.add(7);
//        list2.add(20);

        // BiConsumer to compare both lists
        BiConsumer<List<Integer>,List<Integer>> comparedResult = (lista,listb) ->{

            if(lista.size() != listb.size()){
                System.out.println("Two different lists");
            }else{
                for(int i = 0 ; i<lista.size(); i++){
                    if(lista.get(i) != listb.get(i)) {
                        System.out.println("Two different lists");
                        return;
                    }
                }
                System.out.println("Equal lists");
            }
        };
        //comparedResult.accept(list1,list2);

        //BiConsumer to print two lists

        BiConsumer<List<Integer>,List<Integer>> printLists = (lista, listb) ->{

            lista.stream().forEach(a -> System.out.print(a + " "));
            System.out.println();
            listb.stream().forEach(b -> System.out.println(b + " "));
            System.out.println();
        };

        //andThen()
        comparedResult.andThen(printLists).accept(list1,list2);
        //Normal technique
       // compareList(list1,list2);
    }

//    public void compareList(List<Integer> lista,List<Integer> listb){
//        if(lista.size() != listb.size()){
//            System.out.println("Two different lists");
//        }else{
//            for(int i = 0 ; i<lista.size(); i++){
//                if(lista.get(i) != listb.get(i)){
//                    System.out.println("Two different lists");
//                }
//            }
//            System.out.println("Equal lists");
//        }
//    }
}
