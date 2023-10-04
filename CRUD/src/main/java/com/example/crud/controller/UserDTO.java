package com.example.crud.controller;


import com.example.crud.domain.UserTable;
import lombok.Getter;

@Getter
public class UserDTO {
    private String userName;

    public UserTable toEntity(){
        return new UserTable(userName);
    }
}
