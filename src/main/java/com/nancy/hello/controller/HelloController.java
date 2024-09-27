package com.nancy.hello.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // @ called "Beans" - packages that we can use in Spring Boot
public class HelloController {

    @GetMapping("/")    // request my web app without additional url info
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
