package com.ssh.domain;

/**
 * Mymusics entity. @author MyEclipse Persistence Tools
 */

public class Mymusics implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer mmid;
	private Users users;
	private Musics musics;

	// Constructors

	/** default constructor */
	public Mymusics() {
	}

	/** minimal constructor */
	public Mymusics(Integer mmid) {
		this.mmid = mmid;
	}

	/** full constructor */
	public Mymusics(Integer mmid, Users users, Musics musics) {
		this.mmid = mmid;
		this.users = users;
		this.musics = musics;
	}

	// Property accessors

	public Integer getMmid() {
		return this.mmid;
	}

	public void setMmid(Integer mmid) {
		this.mmid = mmid;
	}

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public Musics getMusics() {
		return this.musics;
	}

	public void setMusics(Musics musics) {
		this.musics = musics;
	}

}