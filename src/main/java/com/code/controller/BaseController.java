package com.code.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author BadCode
 * @date 2023/6/9 1:22
 */
@RestController
@RequestMapping
public class BaseController {

    @GetMapping
    public String sayHello(){
        return "Hello Controller...";
    }
}
