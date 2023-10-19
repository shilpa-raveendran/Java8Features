package com.shilpa.MapVsFlatMap;

import java.util.List;

public class Employee {

    private int empId;
    private String name;
    private List<String> prevLocation;

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", prevLocation=" + prevLocation +
                '}';
    }

    public Employee(int empId, String name, List<String> prevLocation) {
        this.empId = empId;
        this.name = name;
        this.prevLocation = prevLocation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPrevLocation() {
        return prevLocation;
    }

    public void setPrevLocation(List<String> prevLocation) {
        this.prevLocation = prevLocation;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }
}
