package com.edusol.demospringboot.controller;


import com.edusol.demospringboot.model.Employee;
import com.edusol.demospringboot.model.EmployeeTable;
import com.edusol.demospringboot.repository.EmployeeJpaRepository;
import com.edusol.demospringboot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeCrudController {

    @Autowired
    EmployeeService service;
    //ArrayList<Employee> employees= new ArrayList<>();
    //C

    @RequestMapping(value = "/add_emp", method = RequestMethod.POST)
    public String addEmp(@RequestBody EmployeeTable employee){
        //employees.add(employee);
        return  service.add(employee);

    }

    //R
    @RequestMapping(value ="/get_emp", method = RequestMethod.GET)
    public List<EmployeeTable> getEmp(){

       return service.getEmp();
        //return employees;
    }

    //U

   /* @RequestMapping(value ="/update_emp/{name}", method = RequestMethod.PUT)
    public String updateEmp(@PathVariable String name){

        employees.get(0).setName(name);
       return "Employee name updated Successfully as "+name;
    }
*/
    //D
  /*  @RequestMapping(value = "/delete_emp",method = RequestMethod.DELETE )
   public  String remove(@RequestParam int index){

      employees.remove(index);
       return "Successfully removed Employee";
   }
*/

}
