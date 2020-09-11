package com.example.cloud.controller;

import com.example.cloud.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.cloud.repository.UserRepository;

import java.util.List;


@RestController
public class userController {
    @Autowired
    UserRepository userRepository;

    @GetMapping("/getuser")
    public List<User> getAllUser(){
        return userRepository.findAll();
    }
}
