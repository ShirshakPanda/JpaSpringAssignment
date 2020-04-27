package com.cg.iter.dao;

import com.cg.iter.entity.Student;

public interface StudentDao {
	Boolean create(Student stud);

	Boolean update(Student stud);

	Student getStudent(int id);

	Boolean delete(Student stud);
}
