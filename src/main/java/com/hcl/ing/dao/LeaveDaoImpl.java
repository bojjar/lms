package com.hcl.ing.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hcl.ing.entity.Leaves;
import com.hcl.ing.entity.User;

@Repository
public class LeaveDaoImpl implements LeaveDao {

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
	
	public Leaves userLeaveDetails() {
		Leaves leaveResp=new Leaves();
		leaveResp.setAnnualLeave(12);
		leaveResp.setLeaveId(1);
		leaveResp.setMyLeave(1);
		leaveResp.setRestrictedLeave(4);
		User user=new User();
		user.setUserId(1);
		user.setUsername("rajesh");
		user.setPassword("rajesh1988");
		leaveResp.setUser(user);
		
		//Leaves leaveResp = (Leaves) getSession().get(Leaves.class, sessionFactory);
		//getSession().createCriteria(Leaves.class);
		
		return leaveResp;
	}
	
	
}