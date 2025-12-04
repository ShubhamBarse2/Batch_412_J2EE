package com.tka;

import org.springframework.stereotype.Component;

@Component("com1")
public class Company1 implements Interview {

	@Override
	public String testTiming() {

		return "Reporting Time 10.30AM";
	}

}
