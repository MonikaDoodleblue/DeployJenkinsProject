package com.deployjenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyDeployJenkins {

	@GetMapping("/get1")
	public String getData1() {
		return "Welcome to Jenkins Deploy";
	}

	@GetMapping("/get2")
	public String getData2() {
		return "Hello";
	}

} 