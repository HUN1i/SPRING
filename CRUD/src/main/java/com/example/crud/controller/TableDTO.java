package com.example.crud.controller;

import com.example.crud.domain.MyTable;
import lombok.Getter;

@Getter
public class TableDTO {
    private String memberName;
    private String title;
    private String content;


    public MyTable toEntity() {
        return new MyTable(memberName, title, content);
    }
}
