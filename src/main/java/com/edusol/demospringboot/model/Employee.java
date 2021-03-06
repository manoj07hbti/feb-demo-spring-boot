package com.edusol.demospringboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="EMPLOYEE_7_BATCH")
public class Employee {

    @Id
    @GeneratedValue // auto generate +1
    Long id;

    @Column(name="EMP_NAME")
    String name;

    int empId;
    String dept;

    //default constructor
    public Employee() {
    }

    public Employee(String name, int empId, String dept) {
        this.name = name;
        this.empId = empId;
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}
