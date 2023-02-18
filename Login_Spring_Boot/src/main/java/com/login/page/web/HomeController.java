package com.login.page.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/login")
	public String login() {
		return "Login";
	}

	@GetMapping("/")
	public String home() {
		return "Index";
	}
}
