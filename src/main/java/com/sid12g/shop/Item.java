package com.sid12g.shop;

import jakarta.persistence.*;

@Entity
public class Item {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) // id가 1씩 자동으로 증가
    public Long id;

    public String title;
    public Integer price;
}


