package com.shilpa.CodingQuestions;

import com.shilpa.streamAPI.Employee;
import com.shilpa.streamAPI.EmployeeDataBase;

import java.util.*;
import java.util.stream.Collectors;

public class QuestionsPractice {
    public static void main(String[] args) {
        //groupedByLength();
        //joiningStrings();
        //partitioningBy();
        List<Integer> nos=List.of(1,2,4,5,6,8,3);
        //nos.stream().filter(x->x>5).forEach(x-> System.out.print(x+" "));
        //System.out.println();
        List<String> words= List.of("cat","dog","lion","tiger");
        //words.stream().map(s->s.toUpperCase()).forEach(x-> System.out.print(x+" "));
        List<List<String>> wordsList= Arrays.asList(Arrays.asList("cat","dog"),Arrays.asList("tiger","bat"));
        //System.out.println(wordsList);
        //List<String> result=wordsList.stream().flatMap(Collection::stream).collect(Collectors.toList());
       // System.out.println(result);
        List<Orders> ordersList=addOrders();
        getOrderItemsByCount(ordersList);

        sortItems();
        List<Employee> employeeList = EmployeeDataBase.getAllEmployees();

        sortEmployee(employeeList);
    }
    //sort employees by salary
    private static void sortEmployee(List<Employee> employeeList) {
        employeeList.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .forEach(employee -> System.out.println(employee.getName()+"\t"+employee.getSalary()));
    }

    //Group list of strings by their length
    public static void groupedByLength(){
        List<String> words= List.of("cat","dog","lion","tiger");
        Map<Integer,List<String>> groupedByLength=words.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(groupedByLength);
    }
    //Concatenates strings with a delimiter.
    public static void joiningStrings(){
        List<String> words= List.of("cat","dog","lion","tiger");
        String joinedString=words.stream().collect(Collectors.joining(","));
        System.out.println(joinedString);
    }
    //Partitions elements into two groups based on a predicate.
    public static void partitioningBy(){
    //Partition numbers into even and odd.
        List<Integer> nums= List.of(9,2,3,4,5,6);
        Map<Boolean, List<Integer>> isEven= nums.stream().collect(Collectors.partitioningBy(x->x%2==0));
        System.out.println(isEven);
    }

    public static void getOrderItemsByCount(List<Orders> ordersList){
        Map<String, Long> itemsCount =ordersList.stream().flatMap(x->x.getItemsList().stream()).collect(Collectors.groupingBy(Item::getItemName,Collectors.counting()));
        System.out.println(itemsCount);

    }
    public static void sortItems(){
        Item item1= new Item("Dress");
        Item item2= new Item("Candles");
        Item item3= new Item("Shoes");
        Item item4= new Item("TV");
        List<Item> itemList= Arrays.asList(item1,item2,item3,item4);
        List<String> sortedItem =itemList.stream()
                .sorted(Comparator.comparing(Item::getItemName))
                .map(Item::getItemName)
                .collect(Collectors.toList());
        System.out.println(sortedItem);
        //reverse sorting
        System.out.println("=======reverse sorting======");
        List<String> ReversedItem =itemList.stream()
                .sorted(Comparator.comparing(Item::getItemName).reversed())
                .map(Item::getItemName)
                .collect(Collectors.toList());
        System.out.println(ReversedItem);

    }
    public static List<Orders> addOrders(){
        List<Item> itemList1= Arrays.asList(new Item("Candles"),new Item("Shoes"));
        List<Item> itemList2= Arrays.asList(new Item("Dress"),new Item("bags"));
        List<Item> itemList3= Arrays.asList(new Item("Dress"),new Item("bags"),new Item("tv"));
        Orders order1 = new Orders(itemList1);
        Orders order2 = new Orders(itemList2);
        Orders order3 = new Orders(itemList3);

        List<Orders> ordersList= new ArrayList<>();
        ordersList.add(order1);
        ordersList.add(order2);
        ordersList.add(order3);

        return ordersList;
    }
}
