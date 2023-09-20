package com.example.customvalidationannotation.service;

import com.example.customvalidationannotation.entity.Student;
import com.example.customvalidationannotation.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repository;

    public Student saveStudent(Student student){
        return repository.save(student);
    }

    public Student getStudentById(Long id){
        return repository.findById(id).get();
    }

    public List<Student> getAllStudents(){
        return repository.findAll();
    }
}
