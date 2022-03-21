package com.edusol.demospringboot.controller;

import com.edusol.demospringboot.service.AppFlowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppFlowController {

    /*@Autowired
      ClassName objName;*/

    @Autowired
    AppFlowService appFlowService;

    @RequestMapping("/app_flow")
    public String flow(){

        // AppFlowService obj = new AppFlowService();
        return  appFlowService.flow();
    }

}
