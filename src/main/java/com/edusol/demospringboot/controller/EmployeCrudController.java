package com.edusol.demospringboot.controller;


import com.edusol.demospringboot.model.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class EmployeCrudController {

    ArrayList<Employee> employees= new ArrayList<>();
    //C

    @RequestMapping("/add_emp")
    public String addEmp(){

        employees.add(new Employee("Raj",1,"CS"));
        return "Successfully Added Employee";
    }

    //R
    @RequestMapping("/get_emp")
    public  ArrayList<Employee> getEmp(){

        return employees;
    }

    //U
    //TODO

    //D
    @RequestMapping("/delete_emp")
   public  String remove(){

      employees.remove(0);
       return "Successfully removed Employee";
   }
}
