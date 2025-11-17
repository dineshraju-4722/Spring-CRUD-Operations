package com.Stud_crud.Student.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Stud_crud.Student.Entities.StudentEntity;

@Repository
public interface StudentRepository  extends JpaRepository<StudentEntity, Long>{

}
