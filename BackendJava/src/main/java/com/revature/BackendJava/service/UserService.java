package com.revature.BackendJava.service;


import com.revature.BackendJava.model.User;
import com.revature.BackendJava.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(User user){
         return this.userRepository.save(user);
    }

    public List<User> retrieveUser(){
        return this.userRepository.findAll();
    }
}
