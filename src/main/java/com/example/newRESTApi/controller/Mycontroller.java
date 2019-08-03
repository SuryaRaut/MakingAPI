package com.example.newRESTApi.controller;

import com.example.newRESTApi.service.Myservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class Mycontroller {

    @Autowired
    Myservice ser;

    @GetMapping("/home")
    //@RequestMapping(value = "/home" ,method = GET)
    public String m1(){
        return "Hello surya";
    }
    @GetMapping("/about")
    public String m2(){
        return "Bye Surya";
    }
    @GetMapping("/cal/sum/{a}/{b}")
    public int calculatar(@PathVariable ("a" ) int x, @PathVariable ("b") int y){
        return ser.sum(x,y);
    }
    @GetMapping("/newCal")
    public int subtraction(@PathVariable ("a") int x, @PathVariable ("b") int y){
        return ser.subtract(x, y);

    }
    @GetMapping("/comCal")
    public String getName(@RequestParam String Name){
        return ser.getName("Name :" + Name);

    }

    @GetMapping("/count")
    public int countNumber(@RequestParam(value = "x") int p, @RequestParam(value = "y") int q, @RequestParam(value = "z") int r){
        return ser.count(p,q,r);
    }


}
// H.W. create entire cal 4 method and 4 services. 1 path variable, 3 is query parameter.