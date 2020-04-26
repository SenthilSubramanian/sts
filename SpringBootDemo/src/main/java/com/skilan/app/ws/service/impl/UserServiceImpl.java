package com.skilan.app.ws.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skilan.app.ws.UserRepository;
import com.skilan.app.ws.io.entity.UserEntity;
import com.skilan.app.ws.service.UserService;
import com.skilan.app.ws.shared.dto.UserDTO;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository repo;

	@Override
	public UserDTO createUser(UserDTO userDetails) {		
		UserEntity entity = new UserEntity();		
		BeanUtils.copyProperties(userDetails, entity);
		entity.setUserId("TestUserID");
		entity.setEncryptedPassword("ToBeEncrypt");
		
		UserEntity storedResult = repo.save(entity);
		
		UserDTO resultDTO = new UserDTO();
		BeanUtils.copyProperties(storedResult, resultDTO);
		return resultDTO;
	}

}
