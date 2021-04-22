package com.cc.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ErrorController {

    @GetMapping("/error500")
    public String Error500(){
        int err = 50/0;
        return "abc";
    }
}
