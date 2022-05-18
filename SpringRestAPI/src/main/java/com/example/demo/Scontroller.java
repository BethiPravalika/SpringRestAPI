package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Scontroller {
	
	@Autowired
	private Studentservice obj;
@GetMapping("/home")
public String home() {
	
	return "Welcome to RESTAPI Spring Home ";
}
@GetMapping("/student")
public List<Student> getStudent(){
	
	return this.obj.getStudent();
}
@PostMapping("/addStudent")
public Student addStudent (@RequestBody Student student) 
{
	return this.obj.addStudent(student);
}
@DeleteMapping(".delete/{id")
public void del(@PathVariable Integer id) {
 //Student.deleteById(id);
}
//@PutMapping("update/{id}")
//public Student replace(@RequestBody Student s) {
	//return Student.save(s);
}

