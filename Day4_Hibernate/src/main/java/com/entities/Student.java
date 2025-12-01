package com.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Student {

	@Id
	int studID;
	String name;
	int age;
	String city;

	@OneToOne
	Laptop lap;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int studID, String name, int age, String city, Laptop lap) {
		super();
		this.studID = studID;
		this.name = name;
		this.age = age;
		this.city = city;
		this.lap = lap;
	}

	public int getStudID() {
		return studID;
	}

	public void setStudID(int studID) {
		this.studID = studID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Laptop getLap() {
		return lap;
	}

	public void setLap(Laptop lap) {
		this.lap = lap;
	}

	@Override
	public String toString() {
		return "Student [studID=" + studID + ", name=" + name + ", age=" + age + ", city=" + city + ", lap=" + lap
				+ "]";
	}

}
