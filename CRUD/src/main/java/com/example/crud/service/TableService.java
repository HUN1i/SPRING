package com.example.crud.service;

import com.example.crud.controller.TableDTO;
import com.example.crud.domain.MyTable;
import com.example.crud.repository.TableRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TableService {
    private final TableRepository tableRepo;
    public TableService(TableRepository tableRepo){
        this.tableRepo = tableRepo;
    }
    public List<MyTable> getTables(){
        return tableRepo.findAll();
    }

    public MyTable postTables(TableDTO tableDTO) {
        return tableRepo.save(tableDTO.toEntity());
    }
}
