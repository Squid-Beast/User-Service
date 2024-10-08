package com.example.UserService.controller;

import com.example.UserService.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService service;

    @GetMapping("/preferences/{id}")
    public String getUserPreference(@PathVariable("id") Long id) {
        return service.getUserDetails(id);
    }
}
