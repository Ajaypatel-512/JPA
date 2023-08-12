package com.example.jpapractise.service;

import com.example.jpapractise.Model.User;
import com.example.jpapractise.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> saveUsers(List<User> users) {
        return (List<User>) userRepository.saveAll(users);
    }

    @Override
    public List<User> getUsers() {
        return userRepository.getAllUser();
    }

    @Override
    public User getUserById(int id) {
        return userRepository.getUsers(id);
    }

    @Override
    public User getUserByName(String name) {
        return userRepository.getUserByName(name).get(0);
    }

    @Override
    public User updateUser(User user,String city) {
        User user1 = userRepository.findById(user.getId()).get();
        user1.setCity(city);
        userRepository.save(user1);
        return userRepository.getAllUser().get(0);
    }

    @Override
    public Void deleteUser(int id) {
        userRepository.deleteById(id);
        return null;
    }
}
