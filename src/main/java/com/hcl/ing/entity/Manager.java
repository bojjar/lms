package com.hcl.ing.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="manager")
public class Manager {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int managerId;
	private String managerName;
	private String userrequestType;
	
	@ManyToOne
	@JoinColumn(name ="userId")
	private User user;

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public String getUserrequestType() {
		return userrequestType;
	}

	public void setUserrequestType(String userrequestType) {
		this.userrequestType = userrequestType;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Manager [managerId=" + managerId + ", managerName=" + managerName + ", userrequestType="
				+ userrequestType + ", user=" + user + "]";
	}
	
	
	

}
