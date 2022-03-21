package com.edusol.demospringboot.service;

import com.edusol.demospringboot.model.Employee;
import com.edusol.demospringboot.model.EmployeeTable;
import com.edusol.demospringboot.repository.EmployeeJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeJpaRepository repository;

    public String add(EmployeeTable employee){

        repository.save(employee);

        return "Record saved successfully in DB";
    }

    public List<EmployeeTable> getEmp(){

        return repository.findAll();
    }

    public String delete(Long id){

        repository.deleteById(id);

        return  "record deleted Successfully from DB";
    }
}
