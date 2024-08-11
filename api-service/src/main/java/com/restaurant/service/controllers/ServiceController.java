package com.restaurant.service.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
class ServiceController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello from Service!";
    }
}
