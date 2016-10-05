package com.ssh.interfaces;

import java.util.List;

import com.ssh.domain.Singer;

public interface SingerServiceInterface {
	
	List<Singer> getSingers();
	
	Singer getSinger(int id);

}
