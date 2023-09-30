package com.example.crud.service;

import com.example.crud.controller.TableDTO;
import com.example.crud.domain.MyTable;
import com.example.crud.repository.TableRepository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

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

    public MyTable putTables(TableDTO tableDTO, Integer id) {
        Optional<MyTable> myTable = tableRepo.findById(id);
        if(myTable.isPresent()){
            MyTable existTable = myTable.get();
            return tableRepo.save(existTable.update(tableDTO));

        }
        throw new EntityNotFoundException("없다.");
    }

    public boolean deleteTable(Integer id) {
        tableRepo.deleteById(id);
        return true;
    }

    public Optional<MyTable> getOneTable(Integer id) {
        Optional<MyTable> T =  tableRepo.findById(id);
        if(T.isEmpty()) throw new EntityNotFoundException("없단다");
        return T;
    }
}
