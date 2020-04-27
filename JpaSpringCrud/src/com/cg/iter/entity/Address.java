package com.cg.iter.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {
	@Id
private int houseno;
private String housename;
public Address() {
	super();
	// TODO Auto-generated constructor stub
}
public int getHouseno() {
	return houseno;
}
public void setHouseno(int houseno) {
	this.houseno = houseno;
}
public String getHousename() {
	return housename;
}
public void setHousename(String housename) {
	this.housename = housename;
}
public Address(int houseno, String housename) {
	super();
	this.houseno = houseno;
	this.housename = housename;
}
@Override
public String toString() {
	return "Address [houseno=" + houseno + ", housename=" + housename + "]";
}




}
