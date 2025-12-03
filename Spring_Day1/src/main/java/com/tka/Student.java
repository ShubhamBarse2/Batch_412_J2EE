package com.tka;

import org.springframework.beans.factory.annotation.Value;

public class Student {

	@Value("1231")
	int studId;
	@Value("om")
	String name;
	@Value("nsk")
	String city;

	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int studId, String name, String city) {
		super();
		this.studId = studId;
		this.name = name;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [studId=" + studId + ", name=" + name + ", city=" + city + "]";
	}

}
