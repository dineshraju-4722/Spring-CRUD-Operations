package com.Stud_crud.Student.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Stud_crud.Student.Entities.StudentEntity;
import com.Stud_crud.Student.Repositories.StudentRepository;

@Service
public class StudentService {
@Autowired
private StudentRepository srepo;
	
	
	public StudentEntity getById(Long id) {
		return srepo.findById(id).orElse(null); 
	}


	public List<StudentEntity> getAll() {
		// TODO Auto-generated method stub
		return srepo.findAll();
	}


	public void postStudent(StudentEntity body) {
		// TODO Auto-generated method stub
		 srepo.save(body);
	}


	public void putStudent(StudentEntity body) {
		StudentEntity byId = srepo.findById(body.getId()).orElse(null);
		if(byId==null) {
			postStudent(body);
		}else {
			byId.setId(body.getId());
			byId.setEmail(body.getEmail());
			byId.setName(body.getName());
			byId.setAge(body.getAge());
			srepo.save(byId);
		}
		
	}


	public void deleteStudent(Long id) {
		// TODO Auto-generated method stub
		srepo.deleteById(id);
	}

}
