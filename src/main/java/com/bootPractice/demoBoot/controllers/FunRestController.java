package com.bootPractice.demoBoot.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    @Value("${value.name}")
    private String valueName;
    @Value("${value.designation}")
    private String valueDesignation;
    @GetMapping("/getCustomProperty")
    public String getCustomProperty(){
        return valueName+" "+valueDesignation;
    }
    @GetMapping("/")
    public String sayHello(){
        return "Guten tag";
    }

}
