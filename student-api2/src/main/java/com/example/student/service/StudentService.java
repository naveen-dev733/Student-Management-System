package com.example.student.service;
import java.util.List;

import org.springframework.stereotype.Service;
import com.example.student.entity.Student;
import com.example.student.repository.StudentRepository;
@Service
public class StudentService 
{
	private final StudentRepository repository;

	StudentService(StudentRepository repository) {
		this.repository = repository;
	}
	public Student saveStudent(Student student)
	{
		return repository.save(student);
	}
	public List<Student> getAllStudents()
	{
		return repository.findAll();
		
	}
}
