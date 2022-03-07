package com.edusol.demospringboot.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PathVariableController {

    @RequestMapping("/message/{name}")
    public String  message(@PathVariable String name){

       return name+" Welcome to Path variable tutorial of Spring framework";
    }

    @RequestMapping("/message_two/{name}/{age}")
    public String  message_two(@PathVariable String name, @PathVariable int age){

        return name+" Welcome to Path variable tutorial of Spring framework age: "+age;
    }

    @RequestMapping("/message_param_two")
    public String messageRequestParamTwo(@RequestParam String name, @RequestParam int age){

        return name+" Welcome to Request Param tutorial of Spring framework age is : "+age;
    }
    @RequestMapping("/message_param")
    public String messageRequestParam(@RequestParam String name){

        return name+" Welcome to Request Param tutorial of Spring framework";
    }

}
