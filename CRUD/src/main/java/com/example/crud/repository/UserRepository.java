package com.example.crud.repository;

import com.example.crud.domain.UserTable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserTable, Integer> {
}
