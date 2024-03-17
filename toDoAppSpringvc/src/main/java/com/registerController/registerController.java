package com.registerController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.entities.user;
import com.serviceLayer.serviceIpl;


@Controller
public class registerController {
	
	@Autowired
	serviceIpl serviceIpl;

	// login page

	@RequestMapping("/login")
	public String loginpage() {

		return "login";
	}

	// register page
	@RequestMapping("/register")
	public String registerpage() {

		return "register";
	}
	
	
	// register data
	@RequestMapping(path="/register", method = RequestMethod.POST)
	public String registerData(@ModelAttribute user user) {
		serviceIpl.register(user);
	
		
		return "index";
	}
	
	// login data
		@RequestMapping(path="/login", method = RequestMethod.POST)
		public String loginData(@RequestParam("email") String email, @RequestParam("password") String password) {
		 serviceIpl.login(email, password);
			
			return "index";
		}
	
	
	

}
