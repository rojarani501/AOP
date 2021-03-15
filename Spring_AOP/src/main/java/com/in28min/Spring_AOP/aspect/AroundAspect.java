package com.in28min.Spring_AOP.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect

@Configuration
public class AroundAspect {

	private Logger log = LoggerFactory.getLogger(this.getClass());

	@Around("execution(* com.in28min.Spring_AOP..*.*(..))")
	public void beforemethod(ProceedingJoinPoint jp) throws Throwable {
		Long starttime = System.currentTimeMillis();
		jp.proceed();
		Long timetaken = System.currentTimeMillis() - starttime;

		log.info("intercepted  method cal -{} taken time {}", jp, timetaken);
	}

}
