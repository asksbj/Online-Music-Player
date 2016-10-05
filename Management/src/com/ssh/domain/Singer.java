package com.ssh.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Singer entity. @author MyEclipse Persistence Tools
 */

public class Singer implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer singerid;
	private String singername;
	private Set<Musics> musicses = new HashSet<Musics>();

	// Constructors

	/** default constructor */
	public Singer() {
	}

	/** minimal constructor */
	public Singer(Integer singerid) {
		this.singerid = singerid;
	}

	/** full constructor */
	public Singer(Integer singerid, String singername, Set<Musics> musicses) {
		this.singerid = singerid;
		this.singername = singername;
		this.musicses = musicses;
	}

	// Property accessors

	public Integer getSingerid() {
		return this.singerid;
	}

	public void setSingerid(Integer singerid) {
		this.singerid = singerid;
	}

	public String getSingername() {
		return this.singername;
	}

	public void setSingername(String singername) {
		this.singername = singername;
	}

	public Set<Musics> getMusicses() {
		return this.musicses;
	}

	public void setMusicses(Set<Musics> musicses) {
		this.musicses = musicses;
	}

}