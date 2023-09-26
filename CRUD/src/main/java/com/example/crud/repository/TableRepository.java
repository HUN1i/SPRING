package com.example.crud.repository;

import com.example.crud.domain.MyTable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TableRepository extends JpaRepository<MyTable, Integer> {

}
