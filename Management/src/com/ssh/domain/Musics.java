package com.ssh.domain;

/**
 * Musics entity. @author MyEclipse Persistence Tools
 */

public class Musics implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer musicid;
	private Singer singer;
	private String musicname;
	private String musicpath;

	// Constructors

	/** default constructor */
	public Musics() {
	}

	/** minimal constructor */
	public Musics(Integer musicid) {
		this.musicid = musicid;
	}

	/** full constructor */
	public Musics(Integer musicid, Singer singer, String musicname,
			String musicpath) {
		this.musicid = musicid;
		this.singer = singer;
		this.musicname = musicname;
		this.musicpath = musicpath;
	}

	// Property accessors

	public Integer getMusicid() {
		return this.musicid;
	}

	public void setMusicid(Integer musicid) {
		this.musicid = musicid;
	}

	public Singer getSinger() {
		return this.singer;
	}

	public void setSinger(Singer singer) {
		this.singer = singer;
	}

	public String getMusicname() {
		return this.musicname;
	}

	public void setMusicname(String musicname) {
		this.musicname = musicname;
	}

	public String getMusicpath() {
		return this.musicpath;
	}

	public void setMusicpath(String musicpath) {
		this.musicpath = musicpath;
	}

}