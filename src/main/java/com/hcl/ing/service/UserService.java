package com.hcl.ing.service;

import com.hcl.ing.dto.LoginDto;
import com.hcl.ing.dto.RegistrationDto;
import com.hcl.ing.dto.ResponseDto;

public interface UserService {
	public ResponseDto login(LoginDto userDto);
	public ResponseDto register(RegistrationDto registrationDto);

}
