package com.si.backend.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.si.backend.user.dao.UserRepository;
import com.si.backend.user.entity.UserEntity;
import com.si.backend.user.service.IUserService;

@Component
public class UserServiceImpl implements IUserService {
	@Autowired
	private UserRepository userRepository ;
	@Override
	public List<UserEntity> listUsers() {
		return userRepository.findAll();
	}
	@Override
	public UserEntity createUser(UserEntity userEntity) {
		
		return userRepository.save(userEntity);
	}

}
