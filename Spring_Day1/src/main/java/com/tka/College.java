package com.tka;

import org.springframework.beans.factory.annotation.Value;

public class College {

	@Value("1")
	int college_Id;
	@Value("DYP")
	String c_Name;
	@Value("pune")
	String city;
	
	Student stud;

	public College() {
		super();
		// TODO Auto-generated constructor stub
	}

	public College(int college_Id, String c_Name, String city, Student stud) {
		super();
		this.college_Id = college_Id;
		this.c_Name = c_Name;
		this.city = city;
		this.stud = stud;
	}

	public int getCollege_Id() {
		return college_Id;
	}

	public void setCollege_Id(int college_Id) {
		this.college_Id = college_Id;
	}

	public String getC_Name() {
		return c_Name;
	}

	public void setC_Name(String c_Name) {
		this.c_Name = c_Name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Student getStud() {
		return stud;
	}

	public void setStud(Student stud) {
		this.stud = stud;
	}

	@Override
	public String toString() {
		return "College [college_Id=" + college_Id + ", c_Name=" + c_Name + ", city=" + city + ", stud=" + stud + "]";
	}

}
