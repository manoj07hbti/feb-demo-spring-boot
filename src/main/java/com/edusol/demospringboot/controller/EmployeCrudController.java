package com.edusol.demospringboot.controller;


import com.edusol.demospringboot.model.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class EmployeCrudController {

    ArrayList<Employee> employees= new ArrayList<>();
    //C

    @RequestMapping(value = "/add_emp", method = RequestMethod.POST)
    public String addEmp(@RequestBody Employee employee){

        employees.add(employee);
        return "Successfully Added Employee";
    }

    //R
    @RequestMapping(value ="/get_emp", method = RequestMethod.GET)
    public  ArrayList<Employee> getEmp(){

        return employees;
    }

    //U

    @RequestMapping(value ="/update_emp/{name}", method = RequestMethod.PUT)
    public String updateEmp(@PathVariable String name){

        employees.get(0).setName(name);
       return "Employee name updated Successfully as "+name;
    }

    //D
    @RequestMapping(value = "/delete_emp",method = RequestMethod.DELETE )
   public  String remove(@RequestParam int index){

      employees.remove(index);
       return "Successfully removed Employee";
   }
}
