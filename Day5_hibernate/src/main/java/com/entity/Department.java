package com.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Department { // ONE

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int deptId;
	String name;

	@OneToMany(mappedBy = "dept")
	List<Employee> emp;

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(int deptId, String name, List<Employee> emp) {
		super();
		this.deptId = deptId;
		this.name = name;
		this.emp = emp;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Employee> getEmp() {
		return emp;
	}

	public void setEmp(List<Employee> emp) {
		this.emp = emp;
	}

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", name=" + name + ", emp=" + emp + "]";
	}

}
