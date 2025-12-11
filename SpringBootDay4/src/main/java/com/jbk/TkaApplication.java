package com.jbk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(TkaApplication.class, args);
		System.err.println("Application is started ... !");
	}

}
