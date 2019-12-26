package com.hcl.ing.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.ing.dao.UserDao;
import com.hcl.ing.dto.LoginDto;
import com.hcl.ing.dto.RegistrationDto;
import com.hcl.ing.dto.ResponseDto;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserDao userDao;

	@Transactional
	public ResponseDto login(LoginDto userDto) {
		return userDao.login(userDto);
	}

	@Transactional
	public ResponseDto register(RegistrationDto registrationDto) {
		return userDao.register(registrationDto);
	}

}
