package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// 自动装配：核心。
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello,spring~";
    }
}
