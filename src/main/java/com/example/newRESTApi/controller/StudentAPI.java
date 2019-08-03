package com.example.newRESTApi.controller;

import com.example.newRESTApi.model.Student;
import com.example.newRESTApi.service.StudetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentAPI {

    @Autowired
    StudetService ser;

    @PostMapping("/add")
    public String saveStudent(@RequestBody Student s){
        String msg = ser.saveifo(s);
        return msg;
    }

    @GetMapping("/get")
    public Optional<Student> getStudent(@RequestParam int id){
        return ser.getInfo(id);
    }
    @DeleteMapping("/delete")
    public String deleteStudent(@RequestParam int id){
        return ser.deleteInfo(id);

    }
    @PutMapping("/update/{id}")
    public String updateStudent(@PathVariable int id){
        return ser.updateinfo(id);
    }
    @GetMapping("/getAll")
    public List<Student> getAllStudent(){
        return ser.getAllInfo();
    }

}

//delete mapping// update/put 3// findall api