package com.cg.iter.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.iter.dao.StudentDao;
import com.cg.iter.entity.Student;

public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDao sDao;
	public StudentServiceImpl() {
		System.out.println("service entered now");
		System.out.println(sDao);
	}
	@Override
	public Boolean create(Student stud) {
		// TODO Auto-generated method stub
		return sDao.create(stud);
	}
	@Override
	public Boolean update(Student stud) {
		// TODO Auto-generated method stub
		return sDao.update(stud);
	}
	@Override
	public Student getStudent(int id) {
		
		return sDao.getStudent(id);
	}
	@Override
	public Boolean delete(Student stud) {
		
		return sDao.delete(stud);
	}

}
