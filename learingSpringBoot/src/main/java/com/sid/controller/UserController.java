package com.sid.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sid.model.User;
import com.sid.service.UserService;

@RestController
public class UserController {
	@Autowired
	UserService userService;
	

	@RequestMapping(value="/allUsers",method=RequestMethod.GET)
	public ResponseEntity<List<User>> getAllUsers(){
		return new ResponseEntity<List<User>>(userService.getUsers(), HttpStatus.OK);
	}
	@RequestMapping(value="/user",method=RequestMethod.POST)
	public ResponseEntity<User> addUser(@RequestBody User user){
		System.out.println(user.getId());
		System.out.println(user.getName());
		
		return new ResponseEntity<User>(userService.createUser(user), HttpStatus.CREATED);
	}
	@RequestMapping(value="user", method= RequestMethod.PUT)
	public ResponseEntity<User> updateUser(@RequestBody User newUser){
		if(userService.getUser(newUser.getId()) == null){
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<User>(userService.createUser(newUser), HttpStatus.CREATED);
	}
	@RequestMapping(value="{id}",method= RequestMethod.DELETE)
	public void deleteUser(@PathVariable("id") Integer id){
		if(userService.getUser(id)== null){
			System.out.println("Not found with the id: "+id);
		}
		userService.deleteUser(id);
	}
	

}
