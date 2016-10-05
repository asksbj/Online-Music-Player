package com.ssh.impl;

import java.util.ArrayList;
import java.util.List;

import com.ssh.domain.Musics;
import com.ssh.interfaces.PageServiceInterface;

public class PageService implements PageServiceInterface {

	@Override
	public List<Object> getPageElements(int pagenum, int number, List<Object> list) {
		// TODO Auto-generated method stub
		List<Object> newlist = new ArrayList<Object>();
		for(int i=(pagenum-1*number);i<pagenum*number;i++){
			newlist.add(list.get(i));
		}
		return newlist;
	}
	

	@Override
	public int getPageNumber(int number, int total) {
		// TODO Auto-generated method stub
		int pagenumber = (total-1)/number+1;
		return pagenumber;
	}

}
