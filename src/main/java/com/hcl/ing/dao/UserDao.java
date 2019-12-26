package com.hcl.ing.dao;

import java.util.List;

import com.hcl.ing.dto.LoginDto;
import com.hcl.ing.dto.RegistrationDto;
import com.hcl.ing.dto.ResponseDto;
import com.hcl.ing.entity.User;

public interface UserDao {

	public ResponseDto login(LoginDto loginDto);

	public ResponseDto register(RegistrationDto registrationDto);

	public List<User> userList();

}
