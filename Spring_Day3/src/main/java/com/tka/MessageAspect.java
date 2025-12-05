package com.tka;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MessageAspect {

//	@Before("execution( public void myRecharge())")
//	public void beforeMsg() {
//		System.err.println("UR pack is Expiring Soon . Plz Recharge ... ! ");
//	}

//	@Before("execution (* com.tka.Recharge.*(..))")
//	public void beforeMsg() {
//		System.err.println("UR pack is Expiring Soon . Plz Recharge ... ! ");
//	}

//	@After("execution (* com.tka.Recharge.*(..))")
//	public void afterMsg() {
//		System.err.println("Congratulation Enjoy ur Data Pack ... ! ");
//	}

	@Around("execution (* com.tka.Recharge.*(..))")
	public void aroundMsg(ProceedingJoinPoint p) {
		System.err.println("UR pack is Expiring Soon . Plz Recharge ... ! ");

		try {
			p.proceed();
		} catch (Throwable e) {

			e.printStackTrace();

		}
		System.err.println("Congratulation Enjoy ur Data Pack ... ! ");
	}

}
