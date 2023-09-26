package com.example.crud.domain;

import com.example.crud.controller.TableDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
public class MyTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer memberId;
    private String memberName;
    private String title;
    private String content;

    public MyTable(String memberName, String title, String content) {
        this.memberName = memberName;
        this.title = title;
        this.content = content;
    }

    public MyTable update(TableDTO tableDTO) {
        this.memberName = tableDTO.getMemberName();
        this.title = tableDTO.getTitle();
        this.content = tableDTO.getContent();
        return this;
    }
}
