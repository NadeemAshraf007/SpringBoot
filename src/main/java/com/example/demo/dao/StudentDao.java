package com.example.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Student;

@Repository
public class StudentDao {
	@Autowired
	EntityManager entityManager;

	public List<Student> getStudents(){

		Session session =entityManager.unwrap(Session.class);
		@SuppressWarnings("unchecked")
		List<Student> lstStudent= session.createQuery("FROM Student e").getResultList();
		System.out.println(lstStudent);
		return lstStudent;



	}
}
