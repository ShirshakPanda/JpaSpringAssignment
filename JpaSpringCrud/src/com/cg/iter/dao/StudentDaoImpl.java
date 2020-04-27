package com.cg.iter.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.cg.iter.entity.Student;
import com.cg.iter.util.JpaUtil;

public class StudentDaoImpl implements StudentDao {

	public StudentDaoImpl() {
		System.out.println("dao entered now");
	}
	@Override
	public  Boolean create(Student stud) {
		try {
		EntityManager em = JpaUtil.getEntityManager();
		em.getTransaction().begin();
		em.persist(stud);
		em.getTransaction().commit();
		return true;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}


	@Override
	
	public Student getStudent(int id) {
		Student stud=null;
		try {
	EntityManager em=JpaUtil.getEntityManager();
	
	stud=em.find(Student.class, id);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return stud;
	}


	@Override
	public Boolean update(Student stud) {
		Boolean update=false;
		try {
		EntityManager em=JpaUtil.getEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.merge(stud);
		et.commit();
		update=true;
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return update;
	}


	@Override
	public Boolean delete(Student stud) {
		Boolean delete=false;
		try {
		EntityManager em=JpaUtil.getEntityManager();
		em.getTransaction().begin();
		em.remove(stud);
		em.getTransaction().commit();
		delete=true;
	}catch (Exception e) {
		e.printStackTrace();
	}
		return delete;
		}

}

