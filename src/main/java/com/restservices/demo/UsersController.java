package com.restservices.demo;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UsersController {
	@GetMapping
	public String getUsers(@RequestParam(value="page") int pageno,@RequestParam(value="limit") int limitno) 
	{
		return "http GET request was sent for page:"+pageno+" limit is:"+limitno;
	}
	
	@GetMapping(path="/{userID}")     //path parameter
	public String getUser(@PathVariable String userID ) 
	{
		return "http GET request was sent for userID:"+userID;
	}
	
	@PostMapping
	public String createUsers() 
	{
		return "http Post request was sent";
	}
	@PutMapping
	public String updateUsers() 
	{
		return "http PUT request was sent";
	}
	@DeleteMapping
	public String deleteUsers() 
	{
		return "http Delete request was sent";
	}

}
