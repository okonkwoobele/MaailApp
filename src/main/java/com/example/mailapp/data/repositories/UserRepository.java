package com.example.mailapp.data.repositories;


import com.example.mailapp.data.models.User;

import java.util.List;

public interface UserRepository {
    User save(User user);
    User findById(Long id);
    void deleteById(Long id);
    void deleteAll();
    List<User> findAll();

}
