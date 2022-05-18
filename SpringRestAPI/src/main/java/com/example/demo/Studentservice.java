package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Studentservice {

	@Autowired
	private StudentRepo studentrepo;
	
	public Studentservice() {
		
	}
	public Student addStudent (Student s)
	{
		return  studentrepo.save(s);
	}
	public List<Student> getStudent() {
		
		return studentrepo.findAll();
	}
	
	

}

