package com.shilpa.streamAPI;

import java.util.Arrays;
import java.util.List;

public class EmployeeDataBase {
    public static List<Employee> getAllEmployees(){

        Project p1 = new Project("Home Loan","CIBC","John Hu");
        Project p2 = new Project("Travel Insurance","TD","Matt Tim");
        Project p3 = new Project("Credit Cards","BMO","Joe Doe");

        Employee e1 = new Employee(1,"Steve","Development", Arrays.asList(p1),2500.25,"Male");
        Employee e2 = new Employee(2,"Shilpa","Development", Arrays.asList(p1,p2),2600.25,"Female");
        Employee e3 = new Employee(3,"Alex","Testing", Arrays.asList(p1),1800,"Male");
        Employee e4 = new Employee(4,"June","Sales", Arrays.asList(p1,p2,p3),1500,"Female");
        Employee e5 = new Employee(5,"Holly","Finance", Arrays.asList(p1),1800,"Female");
        Employee e6 = new Employee(6,"James","Development", Arrays.asList(p3),2500.25,"Male");
        Employee e7 = new Employee(7,"Emily","Testing", Arrays.asList(p1,p3),1750.34,"Female");
        Employee e8 = new Employee(8,"Millie","Sales", Arrays.asList(p1,p2),1500.25,"Female");

        return Arrays.asList(e1,e2,e3,e4,e5,e6,e7,e8);
    }
}
