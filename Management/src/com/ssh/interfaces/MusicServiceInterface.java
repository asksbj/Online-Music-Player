package com.ssh.interfaces;

import java.util.List;

import com.ssh.domain.Musiclist;
import com.ssh.domain.Musics;
import com.ssh.domain.Singer;
import com.ssh.domain.Users;

public interface MusicServiceInterface {
	
	List<Musics> showMusics(Users user);
	
	Musics getMusic(int musicid);
	
	List<Musics> listMusics(Musiclist musiclist);
	
	String getListpath(Musiclist musiclist);
	
	List<Musics> getMusicbySinger(Singer singer);
	
	String getSingerpath(Singer singer);
	
	

}
