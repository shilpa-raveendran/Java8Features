package com.shilpa.MapVsFlatMap;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Runner {

    public static void main(String[] args) {
        List<String> location1 = new ArrayList<>();
        location1.add("Toronto");
        location1.add("Bangalore");
        location1.add("Delhi");
        Employee emp1 = new Employee(1,"Tom",location1);

        List<String> location2 = new ArrayList<>();
        location2.add("Montreal");
        location2.add("Dubai");
        location2.add("Bangalore");
        Employee emp2 = new Employee(2,"John",location2);

        List<String> location3 = new ArrayList<>();
        location3.add("Noida");
        location3.add("Bangalore");
        Employee emp3 = new Employee(3,"Matt",location3);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.stream().forEach(x-> System.out.println(x));

        //list all the employee ids
        List<Integer> employeeids= employeeList.stream().map(emp ->emp.getEmpId()).collect(Collectors.toList());
        System.out.println(employeeids);

        //flatMap
        //combination of map and flattening operation

        Set<String> locationLists= employeeList.stream().flatMap(x->x.getPrevLocation().stream()).collect(Collectors.toSet());
        System.out.println(locationLists);
    }
}
