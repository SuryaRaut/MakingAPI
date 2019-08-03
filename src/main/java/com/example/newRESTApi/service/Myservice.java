package com.example.newRESTApi.service;

import org.springframework.stereotype.Service;

@Service
public class Myservice {

    public int sum(int p, int q){
        return p+q;
    }

    public int subtract(int a, int b){
        return a -b;
    }

    public String getName(String name){
        //name = "Surya";
        return "Hello, " +name + "!";
    }

    public int count(int a, int b, int c){
        //logic
        return (a +b+c);
    }
}
