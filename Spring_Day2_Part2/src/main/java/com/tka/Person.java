package com.tka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {

	@Autowired
	@Qualifier("com1")
	Interview intr1;
	
	@Autowired
	@Qualifier("com2")
	Interview intr2;

	public Interview getIntr1() {
		return intr1;
	}

	public void setIntr1(Interview intr1) {
		this.intr1 = intr1;
	}

	public Interview getIntr2() {
		return intr2;
	}

	public void setIntr2(Interview intr2) {
		this.intr2 = intr2;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(Interview intr1, Interview intr2) {
		super();
		this.intr1 = intr1;
		this.intr2 = intr2;
	}

	@Override
	public String toString() {
		return "Person [intr1=" + intr1 + ", intr2=" + intr2 + "]";
	}

}
