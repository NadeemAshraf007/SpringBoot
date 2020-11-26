package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/Student")
public class StudentController{

	@Autowired
	private StudentService  studentService;
	

	@RequestMapping(value="/allList")	
	@GetMapping
	public List<Student> getStudents(){

		List<Student> lstStudent= new ArrayList<>();
		lstStudent=studentService.getStudents();
		
		return lstStudent;



	}
	
	


}
