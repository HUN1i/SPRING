package com.example.crud.controller;

import com.example.crud.domain.MyTable;
import com.example.crud.service.TableService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TableController {
    private final TableService tableService;

    public TableController(TableService tableService) {
        this.tableService = tableService;
    }

    @GetMapping
    public List<MyTable> getAll(){
        return tableService.getTables();
    }

    @PostMapping
    public MyTable postAll(@RequestBody TableDTO tableDTO){
        return tableService.postTables(tableDTO);
    }
}
