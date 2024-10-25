package com.ust.cicd.api;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyApi {
    public String Hello(){
        return "Hello World";
    }
}
