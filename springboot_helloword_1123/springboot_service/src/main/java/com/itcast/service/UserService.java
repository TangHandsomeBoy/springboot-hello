package com.itcast.service;

import com.itcast.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {
        List<User> findAll();

        User findById(int id);

        User selectById(int id);

        User selectId(int id);
}
