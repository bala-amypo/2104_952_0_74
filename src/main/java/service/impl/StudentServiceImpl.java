package com.example.demo.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.service.StudentService;
import com.example.demo.repository.StudentRespository;
import com.example.demo.entity.Student;
@Service
public class StudentServiceImpl implement StudentService{
    @Autowired
    StudentRepository stdrepo
    @Override
    public Student postStudent(Student st){
        return stdrepo.save(st);

    }


}