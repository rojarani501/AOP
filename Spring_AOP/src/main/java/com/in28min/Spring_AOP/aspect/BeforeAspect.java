package com.in28min.Spring_AOP.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class BeforeAspect {
	
	private Logger log= LoggerFactory.getLogger(this.getClass());
	
	@Before("execution(* com.in28min.Spring_AOP.Business.*.*(..))")
	public void beforemethod(JoinPoint jp) {
		
		log.info("intercepted before method cal -{}", jp);
	}
	
	/*
	 * @After("execution(* com.in28min.Spring_AOP.Business.*.*(..))") public void
	 * aftermethod(JoinPoint jp) {
	 * 
	 * log.info("intercepted after method cal -{}", jp); }
	 */
	 
	
}
