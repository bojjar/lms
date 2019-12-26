package com.hcl.ing.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.ing.dao.LeaveDao;
import com.hcl.ing.entity.Leaves;

@Service
public class LeaveServiceImpl implements LeaveService {

	@Autowired
	LeaveDao leaveDao;

	public Leaves userLeaveDetails() {
		
		return leaveDao.userLeaveDetails();
	}


	
}
