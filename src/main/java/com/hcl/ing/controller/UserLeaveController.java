package com.hcl.ing.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.ing.entity.Leaves;
import com.hcl.ing.service.LeaveService;


@RestController
@RequestMapping("/customers")
@CrossOrigin(allowedHeaders = { "*", "*/" }, origins = { "*", "*/" })
public class UserLeaveController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(UserLeaveController.class);
	
	
	@Autowired
	LeaveService leaveService;
	
	/**
	 * 
	 * @param empty
	 * @return ResponseEntity leave details
	 * @throws 
	 */
	@RequestMapping(value = "/getUserLeaveDetails", method = RequestMethod.GET)
	public ResponseEntity<Leaves> getUserLeaveDetails() {
		
		LOGGER.info("getUserLeaveDetails Method in CustomerController started");
		return new ResponseEntity<Leaves>(leaveService.userLeaveDetails(), HttpStatus.OK);
	}
	
	
}
