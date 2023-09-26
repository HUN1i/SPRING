package com.example.crud.domain;

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

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
