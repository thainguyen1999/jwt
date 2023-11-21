package com.example.jwt.service;

import com.example.jwt.entity.User;
import com.example.jwt.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public boolean createAccount(User user) {
        try {
            userRepository.save(user);
            return true;
        }catch (Exception ex) {
            System.out.println(ex.getMessage());
            return  false;
        }
    }

    public User findUserByUsername(String username) {
        return userRepository.findUserByUsername(username);
    }
}
