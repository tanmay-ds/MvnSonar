package com.example.MvnSonar.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	public int hello() {
		
		int a=1,b=2;
		
		return a+b;
		
	}

}
