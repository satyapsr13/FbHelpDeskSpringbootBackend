package com.fbhelpdesk.fbhelpdesk.service;

import com.fbhelpdesk.fbhelpdesk.model.User;
import com.fbhelpdesk.fbhelpdesk.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserService {


    @Autowired
    private UserRepository userRepository;


    // crud

    public User addUser(User user)
    {
        user.setUserId(UUID.randomUUID().toString().split("_")[0]);
     return   userRepository.save(user);
    }

    public List<User> getAllUser()
    {
        return userRepository.findAll();
    }
    public User getUser(String userId)
    {
        return userRepository.findById(userId).get();
    }

    public  User updateUser(User user){

        User existingUser=userRepository.findById(user.getUserId()).get();

        existingUser.setName(user.getName());
        existingUser.setEmail(user.getEmail());

        existingUser.setPassword(user.getPassword());
        return userRepository.save(existingUser);
    }

    public  String deleteUser(String userId)
    {
        userRepository.deleteById(userId);
        return  userId+ " deleted successfully";
    }

}
