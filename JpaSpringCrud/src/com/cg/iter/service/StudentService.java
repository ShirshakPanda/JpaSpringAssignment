package com.cg.iter.service;

import com.cg.iter.entity.Student;

public interface StudentService {
	Boolean create(Student stud);

	Boolean update(Student stud);

	Student getStudent(int id);

	Boolean delete(Student stud);
}
