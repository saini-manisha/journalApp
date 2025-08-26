package com.edigest.myFirstProject.controller;

import com.edigest.myFirstProject.entity.User;
import com.edigest.myFirstProject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/public")
public class PublicControler {

    @Autowired
    private UserService userService;

    @GetMapping("/health-check")
    public String health_check(){
        return "OK";
    }

    @PostMapping
    public void createUser(@RequestBody User user){
        userService.saveNewUser(user);
    }

}
