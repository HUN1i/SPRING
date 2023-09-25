package com.example.crud.controller;

import com.example.crud.domain.myTable;
import com.example.crud.service.TableService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TableController {
    private final TableService tableService;

    public TableController(TableService tableService) {
        this.tableService = tableService;
    }

    @GetMapping
    public List<myTable> getAll(){
        return tableService.getTables();
    }
}
