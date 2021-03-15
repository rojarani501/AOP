package com.in28min.Spring_AOP.Business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.in28min.Spring_AOP.Data.Dao1;

@Service
public class Business1 {
	@Autowired
	private Dao1 dao1;
	
	public String calculateSome1() {
		return dao1.retriveSome();
	}

	
	

}
