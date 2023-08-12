package com.example.jpapractise.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.example.jpapractise.Model.User;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends CrudRepository<User,Integer> {

    public List<User> findByName(String name);

    public List<User> findByNameAndCity(String name, String city);

    public List<User> findByStatus(String status);

    public List<User> findByNameStartingWith(String prefix);

    public List<User> findByNameEndingWith(String suffix);

    public List<User> findByNameContaining(String word);

    // JPQL
    @Query("select u FROM User u")
    public List<User> getAllUser();

    @Query("select u FROM User u WHERE u.name =:n")
    public List<User> getUserByName(@Param("n") String name);

    @Query("select u FROM User u WHERE u.name =:n and u.city =:c")
    public List<User> getUserByNameAndCity(@Param("n") String name,@Param("c") String city);


    // Native Query
    @Query(value = "select * FROM user WHERE n.id =:n")
    public User getUsers(@Param("n") int id);



}
