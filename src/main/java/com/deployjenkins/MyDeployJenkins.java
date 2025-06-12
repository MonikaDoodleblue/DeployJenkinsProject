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

	@GetMapping("/get3")
	public String palindrome() {
		String a = "mom";
		String b = "";
		for (int i = a.length() - 1; i >= 0; i--) {
			b += a.charAt(i);
		}
		if (b.equalsIgnoreCase(a)) {
			return "is palindrome";
		} else {
			return "not palindrome";
		}
	}

}