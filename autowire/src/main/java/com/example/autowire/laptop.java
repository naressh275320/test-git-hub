package com.example.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class laptop {
    private int id;
    private String name; 

    @Autowired
    private alien a;

    void show(){
        System.out.println("in show");
        a.compile();
    }
}
