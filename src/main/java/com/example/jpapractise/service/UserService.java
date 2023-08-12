package com.example.jpapractise.service;

import com.example.jpapractise.Model.User;

import java.util.List;

public interface UserService {

    User saveUser(User user);

    List<User> saveUsers(List<User> users);

    List<User> getUsers();

    User getUserById(int id);

    User getUserByName(String name);

    User updateUser(User user,String city);

    Void deleteUser(int id);
}
