package com.si.backend.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.si.backend.user.entity.UserEntity;
import com.si.backend.user.service.IUserService;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
	private IUserService userService ;
	@RequestMapping("/login")
	public String login(){
		List<UserEntity> users = userService.listUsers() ;
		return users.get(0).getName() ;
	}
	
	@RequestMapping("/create")
	@Transactional
	public String create(){
		List<UserEntity> users = userService.listUsers() ;
		UserEntity userEntity = new UserEntity() ;
		userEntity.setName("Dickens3");
		userService.createUser(userEntity) ;
		List<UserEntity> user2 = userService.listUsers() ;
		return userEntity.getName() ;
	}
	
}
