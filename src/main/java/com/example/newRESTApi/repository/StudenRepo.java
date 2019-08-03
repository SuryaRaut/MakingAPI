package com.example.newRESTApi.repository;

import com.example.newRESTApi.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudenRepo extends CrudRepository<Student,Integer> {
    List<Student> findAll(Iterable<Integer> id);
}
