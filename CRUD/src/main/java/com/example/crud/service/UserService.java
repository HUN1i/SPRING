package com.example.crud.service;


import com.example.crud.controller.UserDTO;
import com.example.crud.domain.UserTable;
import com.example.crud.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository tableRepo;
    public UserService(UserRepository tableRepo) {
        this.tableRepo = tableRepo;
    }

    public UserTable postName(UserDTO userDTO) {
        return tableRepo.save(userDTO.toEntity());
    }
}
