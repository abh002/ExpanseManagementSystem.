package com.example.expensemanager.service;

import com.example.expensemanager.model.User;
import com.example.expensemanager.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User registerUser(String username, String email, String password) {
        User user = new User();
        user.setUsername(username);
        user.setEmail(email);
        user.setPassword(password);
        return userRepository.save(user); // Save user in MongoDB
    }

    public User findUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }
}
