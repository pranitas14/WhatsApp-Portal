package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.User;

public interface UserService {
    List<User> getAllUsers();
    User getUserById(Long id);
    User getUserByUsername(String username);
    User createUser(User user);
    User updateUser(Long id, User user);
	void deleteUser(Long id);
}
