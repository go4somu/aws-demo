package com.ss.awsdemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ss.awsdemo.model.Student;
import com.ss.awsdemo.repository.StudentRepository;

@RestController
public class StudentController {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@RequestMapping("/getStudents")
	public Iterable<Student> getStudents(){
		return studentRepository.findAll();
	}

}
