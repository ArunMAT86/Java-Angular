package com.revature.BackendJava.controller;


import com.revature.BackendJava.model.User;
import com.revature.BackendJava.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/users")
public class UserController {

    UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(path = "/")
    public User addUser(User user){
        return this.userService.createUser(user);

    }

    @GetMapping(path = "/")
    public List<User> getUser(){
        return this.userService.retrieveUser();
    }


}
