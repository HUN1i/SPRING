package com.example.crud.service;

import com.example.crud.domain.myTable;
import com.example.crud.repository.TableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TableService {
    private TableRepository tableRepo;
    @Autowired
    public TableService(TableRepository tableRepo){
        this.tableRepo = tableRepo;
    }
    public List<myTable> getTables(){
        return tableRepo.findAll();
    }

}
