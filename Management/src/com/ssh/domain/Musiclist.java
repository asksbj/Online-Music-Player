package com.ssh.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Musiclist entity. @author MyEclipse Persistence Tools
 */

public class Musiclist implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer listid;
	private String listname;
	private Set<Items> itemses = new HashSet<Items>();

	// Constructors

	/** default constructor */
	public Musiclist() {
	}

	/** minimal constructor */
	public Musiclist(Integer listid) {
		this.listid = listid;
	}

	/** full constructor */
	public Musiclist(Integer listid, String listname, Set<Items> itemses) {
		this.listid = listid;
		this.listname = listname;
		this.itemses = itemses;
	}

	// Property accessors

	public Integer getListid() {
		return this.listid;
	}

	public void setListid(Integer listid) {
		this.listid = listid;
	}

	public String getListname() {
		return this.listname;
	}

	public void setListname(String listname) {
		this.listname = listname;
	}

	public Set<Items> getItemses() {
		return this.itemses;
	}

	public void setItemses(Set<Items> itemses) {
		this.itemses = itemses;
	}

}