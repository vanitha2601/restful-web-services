package com.example.restfulwebservices.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class restfullWebServicesController {

    @RequestMapping(method= RequestMethod.GET, path="/hello-world")
    public String helloWorld(){
        return "Hello World";
    }
}
