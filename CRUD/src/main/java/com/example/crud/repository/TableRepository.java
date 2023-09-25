package com.example.crud.repository;

import com.example.crud.domain.myTable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TableRepository extends JpaRepository<myTable, Integer> {

}
