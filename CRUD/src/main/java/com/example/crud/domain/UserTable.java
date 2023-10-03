package com.example.crud.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@Getter
public class UserTable {
    @Id
    @GeneratedValue
    private Integer userId;
    private String userName;

    public UserTable(String userName) {
        this.userName = userName;
    }
}
