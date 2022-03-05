package com.edusol.demospringboot.controller;

import com.edusol.demospringboot.model.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class DemoControllerDay2 {


    //ENDPOINT
    ArrayList <Employee> employees= new ArrayList<>();
    Employee employee1= new Employee("Raj",1,"CS");
    Employee employee2= new Employee("Rahul",1,"IT");
    Employee employee3= new Employee("Rakesh",1,"CS");




    @RequestMapping("/emp_list")
    public  ArrayList <Employee> getEmployeeList(){

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);

       return employees;
    }

    // return first employee from List

    @RequestMapping("/get_first_emp")
    public Employee getEmp(){

        return employees.get(0);
    }

    // return last element

}
