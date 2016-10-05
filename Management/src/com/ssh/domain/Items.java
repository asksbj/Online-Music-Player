package com.ssh.domain;

/**
 * Items entity. @author MyEclipse Persistence Tools
 */

public class Items implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer itemid;
	private Musiclist musiclist;
	private Musics musics;

	// Constructors

	/** default constructor */
	public Items() {
	}

	/** minimal constructor */
	public Items(Integer itemid) {
		this.itemid = itemid;
	}

	/** full constructor */
	public Items(Integer itemid, Musiclist musiclist, Musics musics) {
		this.itemid = itemid;
		this.musiclist = musiclist;
		this.musics = musics;
	}

	// Property accessors

	public Integer getItemid() {
		return this.itemid;
	}

	public void setItemid(Integer itemid) {
		this.itemid = itemid;
	}

	public Musiclist getMusiclist() {
		return this.musiclist;
	}

	public void setMusiclist(Musiclist musiclist) {
		this.musiclist = musiclist;
	}

	public Musics getMusics() {
		return this.musics;
	}

	public void setMusics(Musics musics) {
		this.musics = musics;
	}

}