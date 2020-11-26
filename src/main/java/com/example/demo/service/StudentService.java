package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.StudentDao;
import com.example.demo.entity.Student;

@Service
public class StudentService {
	
	@Autowired
	private StudentDao  studentDao;


	public List<Student> getStudents(){

		List<Student> lstStudent= new ArrayList<>();
		lstStudent=studentDao.getStudents();

		return lstStudent;



	}

}
