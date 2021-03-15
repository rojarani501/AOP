package com.in28min.Spring_AOP.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AfterAspect {

	private Logger log = LoggerFactory.getLogger(this.getClass());

	@After("execution(* com.in28min.Spring_AOP.Business.*.*(..))")
	public void aftermethod(JoinPoint jp) {

		log.info("intercepted after method cal -{}", jp);
	}
	/*
	 * @AfterReturning(value="execution(* com.in28min.Spring_AOP.Business.*.*(..))",
	 * returning = "result") public void afterReturning(JoinPoint jp, Object result
	 * ) {
	 * 
	 * log.info("{} after method with result -{}", jp, result); }
	 * 
	 * @AfterThrowing(value="execution(* com.in28min.Spring_AOP.Business.*.*(..))",
	 * throwing = "exception") public void afterException(JoinPoint jp, Object
	 * exception ) {
	 * 
	 * log.info("{} after method with result -{}", jp, exception); }
	 */
}
