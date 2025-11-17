package com.Stud_crud.Student.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "student")
@Data
public class StudentEntity {
	@Id
   private Long id;
   private String name;
   private int age;
   private String email;
}
