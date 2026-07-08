package com.example.student.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.student.entity.Student;
import com.example.student.service.StudentService;
@RestController
@RequestMapping("/api/students")
@CrossOrigin(origins="*")
public class StudentController 
{

    private final StudentService service;

    StudentController(StudentService service) {
        this.service = service;
    }
    @PostMapping
    public Student addStudent(@RequestBody Student student)
    {
        return service.saveStudent(student);
    }
    @GetMapping
    public List<Student> getStudents()
    {
        return service.getAllStudents();
    }
}