package com.example.customvalidationannotation.controller;

import com.example.customvalidationannotation.entity.Student;
import com.example.customvalidationannotation.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/student")
public class StudentController {

    @Autowired
    private StudentService service;


    @PostMapping("/save")
    public ResponseEntity<Student> addStudent(@RequestBody @Valid Student student){
        return new ResponseEntity<>(service.saveStudent(student), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> addStudent(@PathVariable Long id){
        return ResponseEntity.ok(service.getStudentById(id));
    }

    @GetMapping("/fetchAllStudents")
    public ResponseEntity<List<Student>> addStudent(){
        return ResponseEntity.ok(service.getAllStudents());
    }

}
