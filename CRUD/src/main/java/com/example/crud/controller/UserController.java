package com.example.crud.controller;


import com.example.crud.domain.UserTable;
import com.example.crud.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public UserTable postUser(@RequestBody UserDTO userDTO){
        return userService.postName(userDTO);
    }
}
