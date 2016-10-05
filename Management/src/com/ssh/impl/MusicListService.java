package com.ssh.impl;

import java.util.List;

import org.hibernate.SessionFactory;

import com.ssh.domain.Musiclist;
import com.ssh.interfaces.MusicListServiceInterface;

public class MusicListService implements MusicListServiceInterface {
	
	private SessionFactory sessionfactory;

	public void setSessionfactory(SessionFactory sessionfactory) {
		this.sessionfactory = sessionfactory;
	}

	@Override
	public List<Musiclist> getMusiclists() {
		String hql = "from Musiclist";
		@SuppressWarnings("unchecked")
		List<Musiclist> list = sessionfactory.getCurrentSession().createQuery(hql).list();
		return list;
	}

	@Override
	public Musiclist getMusiclist(int id) {
		
		Musiclist musiclist = (Musiclist)sessionfactory.getCurrentSession().load(Musiclist.class,id);
		return musiclist;
	}

}
