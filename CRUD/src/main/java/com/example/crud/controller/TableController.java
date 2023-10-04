package com.example.crud.controller;

import com.example.crud.domain.MyTable;
import com.example.crud.domain.UserTable;
import com.example.crud.service.TableService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @GetMapping("/{id}")
    public Optional<MyTable> getOne(@PathVariable Integer id){
        return tableService.getOneTable(id);
    }

    @PostMapping
    public MyTable postAll(@RequestBody TableDTO tableDTO){
        return tableService.postTables(tableDTO);
    }

    @PutMapping("/{id}")
    public ResponseEntity<MyTable> putAll(@RequestBody TableDTO tableDTO, @PathVariable Integer id){
        return ResponseEntity.status(HttpStatus.OK).body(tableService.putTables(tableDTO, id));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteOne(@PathVariable Integer id){
        boolean res = tableService.deleteTable(id);
        if(res = true) return ResponseEntity.status(HttpStatus.OK).body("OK");
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Not Found");
    }
}
