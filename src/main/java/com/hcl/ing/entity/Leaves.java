package com.hcl.ing.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="leaves")
public class Leaves {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int leaveId;
	private int annualLeave;
	private int myLeave;
	private int restrictedLeave;
	
	@OneToOne
	@JoinColumn(name ="userId")
	private User user;

	public int getLeaveId() {
		return leaveId;
	}

	public void setLeaveId(int leaveId) {
		this.leaveId = leaveId;
	}

	public int getAnnualLeave() {
		return annualLeave;
	}

	public void setAnnualLeave(int annualLeave) {
		this.annualLeave = annualLeave;
	}

	public int getMyLeave() {
		return myLeave;
	}

	public void setMyLeave(int myLeave) {
		this.myLeave = myLeave;
	}

	public int getRestrictedLeave() {
		return restrictedLeave;
	}

	public void setRestrictedLeave(int restrictedLeave) {
		this.restrictedLeave = restrictedLeave;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Leaves [leaveId=" + leaveId + ", annualLeave=" + annualLeave + ", myLeave=" + myLeave
				+ ", restrictedLeave=" + restrictedLeave + ", user=" + user + "]";
	}
	
	

}
