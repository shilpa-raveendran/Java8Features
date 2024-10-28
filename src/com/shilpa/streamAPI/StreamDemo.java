package com.shilpa.streamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
        List<Employee> employeeList = EmployeeDataBase.getAllEmployees();
        //forEach
//        employeeList.stream()
//                .forEach(s -> System.out.println(s.getName() + ": " + s.getDept()));
        System.out.println("=======Filter==========");
        //filter--> get all employees of development dept
        employeeList.stream()
                .filter(s -> s.getDept().equals("Development"))
                .forEach(s -> System.out.println(s.getName() + ": " + s.getDept()));

        System.out.println("=======map==========");
        List<String> empDeptList = employeeList.stream()
                .map(Employee::getDept)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(empDeptList);

        //FlatMap( to get nested classes; one-to-many objects)
        System.out.println("=======FLatMap==========");
        List<String> projects = employeeList.stream()
                .flatMap(employee -> employee.getProjects()
                        .stream()
                        .map(Project::getName))
                .distinct()
                .collect(Collectors.toList());
        System.out.println(projects);

        //Sorted
        System.out.println("=======sorted==========");
        employeeList.stream()
                .sorted(Comparator.comparing(Employee::getSalary))
                .forEach(employee -> System.out.println(employee.getName()+": "+employee.getSalary()));
        System.out.println("=====reverse sorting============");
        employeeList.stream()
                .sorted(Collections.reverseOrder(Comparator.comparing(Employee::getSalary)))
                .forEach(e-> System.out.println(e.getName()+": "+e.getSalary()));
        System.out.println("=====min/max============");
       Optional<Employee> minSalary= employeeList.stream()
               .min(Comparator.comparingDouble(Employee::getSalary));
       minSalary.stream().forEach(s-> System.out.println("Min Salary: "+s.getSalary()+"\nName:"+s.getName()));

        Optional<Employee> maxSalary= employeeList.stream()
                .max(Comparator.comparingDouble(Employee::getSalary));
        maxSalary.stream().forEach(s-> System.out.println("Max Salary: "+s.getSalary()+"\nName:"+s.getName()));

        System.out.println("=====groupingBy============");
        Map<String, List<String>> genderGroup =employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender,
                        Collectors.mapping(Employee::getName,Collectors.toList())));
        System.out.println(genderGroup);
    }
}
