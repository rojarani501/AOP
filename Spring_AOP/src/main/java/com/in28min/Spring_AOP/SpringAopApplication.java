package com.in28min.Spring_AOP;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28min.Spring_AOP.Business.Business1;
import com.in28min.Spring_AOP.Business.Business2;

@SpringBootApplication
public class SpringAopApplication implements CommandLineRunner {
	private Logger log= org.slf4j.LoggerFactory.getLogger(this.getClass());
	@Autowired
	private Business1 business1;
	@Autowired
	private Business2 business2;
	public static void main(String[] args) {
		SpringApplication.run(SpringAopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		  log.info(business1.calculateSome1());
		  log.info(business2.calculateSome2());
		 
		log.info("hii");
	}

}
