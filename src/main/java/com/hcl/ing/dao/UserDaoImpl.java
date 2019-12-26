package com.hcl.ing.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import com.hcl.ing.dto.LoginDto;
import com.hcl.ing.dto.RegistrationDto;
import com.hcl.ing.dto.ResponseDto;
import com.hcl.ing.entity.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;

	public Session getSession() {
		Session session = null;
		try {
			session = sessionFactory.getCurrentSession();
		} catch (HibernateException e) {
			session = sessionFactory.openSession();
		}
		return session;
	}

	@SuppressWarnings("unchecked")
	public ResponseDto login(LoginDto loginDto) {

		List<User> userList = getSession().createCriteria(User.class).list();

		ResponseDto responseDto = new ResponseDto();

		for (User user1 : userList) {

			if ((loginDto.getuName().equalsIgnoreCase(user1.getUsername()))
					&& (user1.getPassword().equals(loginDto.getPassword()))) {
				responseDto.setMessage("login success");
				responseDto.setStatusCode(HttpStatus.OK.value());
				return responseDto;
			}

		}
		responseDto.setMessage("invalid login");
		responseDto.setStatusCode(HttpStatus.BAD_REQUEST.value());
		return responseDto;

	}

	public ResponseDto register(RegistrationDto registrationDto) {
		ResponseDto responseDto = new ResponseDto();
		User user = new User();
		BeanUtils.copyProperties(registrationDto, user);
		getSession().save(user);
		responseDto.setMessage("Successfull");
		responseDto.setStatusCode(HttpStatus.OK.value());
		return responseDto;
	}

	@SuppressWarnings("unchecked")
	public List<User> userList() {

		return getSession().createCriteria(User.class).list();
	}

}
