package com.itcast.controller;

import com.itcast.pojo.User;
import com.itcast.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/abc")
    public String hello(){
        return "hello world";
    }

    @Autowired
    private UserService userService;

    @RequestMapping("findAll")
    public List<User> findAll(){
        List<User> all = userService.findAll();
        return all;
    }

    @PostMapping("findById/{id}")
    public User findById(@PathVariable(value = "id") int id){
        User user = userService.findById(id);
        return user;
    }


    @PostMapping("selectId/{id}")
    public User selectId(@PathVariable(value = "id") int id){
        User user1 = userService.selectId(id);
        return user1;
    }

    @PostMapping("selectById/{id}")
    public User selectById(@PathVariable(value = "id") int id){
        User user2 = userService.selectById(id);
        return user2;
    }
}
