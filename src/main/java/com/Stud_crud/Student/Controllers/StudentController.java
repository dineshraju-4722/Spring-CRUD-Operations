package com.Stud_crud.Student.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Stud_crud.Student.Entities.StudentEntity;
import com.Stud_crud.Student.Services.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService sserv;
	
	@GetMapping("/getstudent/{id}")
	public StudentEntity getStudent(@PathVariable("id") Long id) {
		return sserv.getById(id);
	}
	
	@GetMapping("/getAllstudents")
	public List<StudentEntity> getAllStudent() {
		return sserv.getAll();
	}
	
	@PostMapping("/postStudent")
	public void postStudent(@RequestBody StudentEntity body) {
		 sserv.postStudent(body);
	}
	
	@PutMapping("/putStudent")
	public void putStudent(@RequestBody StudentEntity body) {
		 sserv.putStudent(body);
	}
	
	@DeleteMapping("/deleteStudent/{id}")
	public void deleteStudent(@PathVariable("id") Long id) {
		sserv.deleteStudent(id);
	}
	
	
 
}
