package com.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "StudentData")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int studID;
	String name;
	int age;
	@Column(name = "address")
	String city;

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

	public Student(int studID, String name, int age, String city) {
		super();
		this.studID = studID;
		this.name = name;
		this.age = age;
		this.city = city;
	}

	public Student() {

	}

	@Override
	public String toString() {
		return "Student [studID=" + studID + ", name=" + name + ", age=" + age + ", city=" + city + "]";
	}

}
