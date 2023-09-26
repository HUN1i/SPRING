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
            existTable.setMemberName(tableDTO.getMemberName());
            existTable.setTitle(tableDTO.getTitle());
            existTable.setContent(tableDTO.getContent());
            return tableRepo.save(existTable);

        }
        throw new EntityNotFoundException("없다.");
    }
}
