package com.edusol.demospringboot.repository;

import org.springframework.stereotype.Repository;

@Repository
public class AppFlowRepository {

    public String flow(){

        return "Response from Repository ";
    }

}
