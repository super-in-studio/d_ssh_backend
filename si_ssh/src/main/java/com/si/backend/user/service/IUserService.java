package com.si.backend.user.service;

import java.util.List;

import com.si.backend.user.entity.UserEntity;

public interface IUserService {

	List<UserEntity> listUsers() ;
	
	UserEntity createUser(UserEntity userEntity) ;
}
