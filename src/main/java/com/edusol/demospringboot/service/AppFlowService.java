package com.edusol.demospringboot.service;

import com.edusol.demospringboot.repository.AppFlowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import  org.springframework.stereotype.Service;

@Service
public class AppFlowService {

    @Autowired
    AppFlowRepository appFlowRepository;

    public String flow(){

        //AppFlowRepository obj = new AppFlowRepository();

        return appFlowRepository.flow();
    }

}
