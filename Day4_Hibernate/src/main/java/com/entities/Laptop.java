package com.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Laptop {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int laptopID;
	String brandName;

	public Laptop() {

	}

	public Laptop(int laptopID, String brandName) {
		super();
		this.laptopID = laptopID;
		this.brandName = brandName;
	}

	public int getLaptopID() {
		return laptopID;
	}

	public void setLaptopID(int laptopID) {
		this.laptopID = laptopID;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	@Override
	public String toString() {
		return "Laptop [laptopID=" + laptopID + ", brandName=" + brandName + "]";
	}

}
