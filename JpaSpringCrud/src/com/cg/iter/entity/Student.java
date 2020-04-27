package com.cg.iter.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Student {
	@Id
	private int id;
	private String name;
	private long mobile;
	private String subject;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="address_id")
	private Address addr;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, long mobile, String subject) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
		this.subject = subject;
	}
	public Student(int id, String name, long mobile, String subject, Address addr) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
		this.subject = subject;
		this.addr = addr;
	}
	public Address getAddr() {
		return addr;
	}
	
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", mobile=" + mobile + ", subject=" + subject + ", addr=" + addr
				+ "]";
	}

	
}


