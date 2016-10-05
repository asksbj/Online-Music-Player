package com.ssh.interfaces;

import java.util.List;

import com.ssh.domain.Musiclist;

public interface MusicListServiceInterface {
	
	List<Musiclist> getMusiclists();
	
	Musiclist getMusiclist(int id);
	
	

}
