package com.naga.user.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "user")
public class User {
	
	@Id
	@Column(name = "username")
	public String username;
	
	@Column(name = "email")
	public String email;

	@Column(name = "password")
	public String password;
	
	@Column(name = "create_time")
	public String createTime;
	
	

}
