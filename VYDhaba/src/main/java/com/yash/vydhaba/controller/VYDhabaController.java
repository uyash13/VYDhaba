package com.yash.vydhaba.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VYDhabaController {

	@RequestMapping(value = "/")
	public String home() {
		System.out.println("In Home Controller");
		return "home.jsp";
	}
	
	@RequestMapping(value = "/login")
	public String loginPage() {
		return "login.jsp";
	}
	
	@RequestMapping(value = "/logout-success")
	public String logout() {
		return "logout.jsp";
	}
}
