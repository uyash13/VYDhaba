package com.yash.vydhaba.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.yash.vydhaba.presentation.model.Name;
import com.yash.vydhaba.presentation.model.UserDetail;
import com.yash.vydhaba.presentation.service.VYDhabaPresentationService;

@RestController
//@ResponseBody
public class VYDhabaController {

	@Autowired
	private VYDhabaPresentationService vYDhabaPresentationService; 
	
	
	@GetMapping(value = "/",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Name> home() {
		System.out.println("In Home Controller");
		String s = "Welcome Home";
		Name name = new Name();
		name.setName(s);
		
		return ResponseEntity.ok(name);
	}
	
	@GetMapping(value = "/users",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<UserDetail>> getAllUsers() {
		System.out.println("In Users Controller");
		
		List<UserDetail> userDetails = vYDhabaPresentationService.getAllUser();
		return ResponseEntity.ok(userDetails);
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
