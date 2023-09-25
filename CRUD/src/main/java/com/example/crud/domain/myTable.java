package com.example.crud.domain;

import javax.persistence.*;

@Entity
public class myTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer memberId;
    private String memberName;
    private String title;
    private String content;

}
