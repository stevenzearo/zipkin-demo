package com.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface HelloWebService {

    @GetMapping("/hello")
    String hello(String name);
}
