package com.in28min.Spring_AOP.Business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.in28min.Spring_AOP.Data.Dao2;

@Service
public class Business2 {
	
	@Autowired
	private Dao2 dao2;
	
	public String calculateSome2() {
		return dao2.retriveSome();
		//return "rose";
	}
}
	