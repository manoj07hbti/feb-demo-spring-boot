package com.edusol.demospringboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="EMPLOYEE_TABLE_BATCH7")
public class EmployeeTable {

    @Id
    @GeneratedValue // auto generate +1
    Long id;

    @Column(name="EMP_NAME")
    String name;

    int empId;
    String dept;
    double salary;
    //default constructor
    public EmployeeTable() {
    }

    public EmployeeTable(String name, int empId, String dept, double salary) {
        this.name = name;
        this.empId = empId;
        this.dept = dept;
        this.salary=salary;
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
