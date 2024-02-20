package com.fbhelpdesk.fbhelpdesk.controller;

import com.fbhelpdesk.fbhelpdesk.model.User;
import com.fbhelpdesk.fbhelpdesk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService service;


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public User createUser(@RequestBody User user)
    {
        return  service.addUser(user);
    }

    @GetMapping
    public List<User> getAllTask()
    {
        return service.getAllUser();
    }

    @GetMapping("/{userId}")
    public User getUser(@PathVariable String userId)
    {

        return   service.getUser(userId);
    }

    @PutMapping
    public User updateUser(@RequestBody User user)
    {

        return service.updateUser(user);

    }

    @DeleteMapping("/{userId}")
    public  String deleteUser(@PathVariable String userId)
    {

        return service.deleteUser(userId);
    }


}
