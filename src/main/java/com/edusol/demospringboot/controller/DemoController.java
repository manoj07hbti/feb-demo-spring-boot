package com.edusol.demospringboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class DemoController {

    //END POINT

    @RequestMapping("/hello")
    public void hello(){

        System.out.println("Hello Spring Boot..");
    }

    //END POINT
    @RequestMapping("/message")
    public String message(){

        return "Hello from Spring Boot";
    }

    @RequestMapping("/list")
    public ArrayList<String> list(){

        ArrayList<String > course= new ArrayList<>();
        course.add("Java");
        course.add("Spring");
        course.add("Spring Boot");

        return course;
    }

}
