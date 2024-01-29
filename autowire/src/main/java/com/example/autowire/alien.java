package com.example.autowire;

import org.springframework.stereotype.Component;

@Component
public class alien {
    public void compile(){
        System.out.println("in compile");
    }
}