package com.code.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author BadCode
 * @date 2023/6/9 0:38
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    public String sayHello(){
        System.out.println("Hello Controller。。。");
        return "Hello SpringBoot...";
    }
}
