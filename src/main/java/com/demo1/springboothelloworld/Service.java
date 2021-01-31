package com.demo1.springboothelloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Service {

	@Autowired
	private AppConfiguration appConfig;
	
	public void print() {
		System.out.println(appConfig.getMail());
		System.out.println(appConfig.getPassword());
	}
	
	
}
