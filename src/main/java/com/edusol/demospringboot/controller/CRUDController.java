package com.edusol.demospringboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class CRUDController {

    ArrayList<String> course= new ArrayList<>();
    //C

    @RequestMapping("/add_course")
    public String add(){

        course.add("Java");

        return "Successfully Added ";
    }

    //R
    @RequestMapping("/get_course")
    public ArrayList<String > getCourse(){

        return course;
    }

    //U
    @RequestMapping("/update_course")
    public String update(){

        course.set(0,"MICROSERVICES");
        return  "Successfully Updated ";
    }
    //D

    @RequestMapping("/remove_course")
    public String remove(){

        course.remove(0);

        return "Successfully Deleted ";
    }
}
