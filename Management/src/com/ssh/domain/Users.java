package com.ssh.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Users entity. @author MyEclipse Persistence Tools
 */

public class Users implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer userid;
	private String username;
	private String password;
	private Set<Mymusics> mymusics = new HashSet<Mymusics>();

	// Constructors

	/** default constructor */
	public Users() {
	}
	
	

	public Users(Integer userid, String username, String password) {
		super();
		this.userid = userid;
		this.username = username;
		this.password = password;
	}



	/** minimal constructor */
	public Users(Integer userid) {
		this.userid = userid;
	}


	// Property accessors

	public Integer getUserid() {
		return this.userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<Mymusics> getMymusics() {
		return mymusics;
	}

	public void setMymusics(Set<Mymusics> mymusics) {
		this.mymusics = mymusics;
	}
	
	

}