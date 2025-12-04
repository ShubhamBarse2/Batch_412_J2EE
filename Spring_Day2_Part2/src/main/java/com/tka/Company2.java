package com.tka;

import org.springframework.stereotype.Component;

@Component("com2")
public class Company2 implements Interview {

	@Override
	public String testTiming() {

		return "Reporting Time 12.30AM";
	}

}
