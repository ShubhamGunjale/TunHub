 package com.tunhub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import com.tunhub.Entity.Users;
import com.tunhub.server.UsersService;

import jakarta.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class UsersController {
@Autowired
	UsersService service;
	 @PostMapping("/register")
	 public String addUser (@ModelAttribute Users user){
       boolean userStatus=service.emailExists(user.getEmail());
       if(userStatus==false) {
    	   service .addUser(user);
    	   System.out.println("user added");
       }
       else {
    	   System.out.println("user already exists");
       }
		return "home";
		 
	 }
	 @PostMapping("/validate")
	 public String validate(@RequestParam ("email") String email,@RequestParam("password")String password ,HttpSession session ) {
	 	//TODO: process POST request
	 	if(service.validateUser(password, email)==true) {
	   String role= service.getRole(email);
	   session.setAttribute("email",email);
	   if(role.equals("admin")) {
	   return "adminHome";
	 }
	 	else {
	 		return "customerHome";
	 	}
	   }
	 	else {
	 		return "login";
	 	}
	 
}
	
	 
     @GetMapping("/logout")
     public String logout(HttpSession session) {
     session.invalidate();
        return "login";
     }
     
	 
}
