package com.ust.cicd.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyApi {
    @GetMapping
    public String Hello(){
        return "Hello World";
    }
}
