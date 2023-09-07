package com.example.springjetty;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class InitialResource {

    @GetMapping
    @RequestMapping("/")
    public String init() {
        String str = "Welcome to Spring Jetty Application";
        System.out.println(str);
        return str;
    }
}
