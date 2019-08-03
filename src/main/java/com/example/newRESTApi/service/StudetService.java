package com.example.newRESTApi.service;

import com.example.newRESTApi.model.Student;
import com.example.newRESTApi.repository.StudenRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudetService {

    @Autowired
    StudenRepo repo;

    public String saveifo(Student s) {
        repo.save(s);
        return "Success";
    }

    public Optional<Student> getInfo(int id) {
        return repo.findById(id);
    }
    public String deleteInfo(int id){
        if(repo.existsById(id)){
            repo.deleteById(id);
            return "Data deleted";
        }else {
            return "Id not exist";
        }
    }

    public String updateinfo(int id) {
        repo.findById(id);
        return "Update Success full";


    }

    public List<Student> getAllInfo(){
        return (List<Student>) repo.findAll();
    }
}
