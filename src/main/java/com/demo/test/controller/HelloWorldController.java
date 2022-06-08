package com.demo.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/hello")
    public String getHello(){
        return "hello world";
    }

    @GetMapping("/hi")
    public String getHi(){
        return "hi world";
    }
}
