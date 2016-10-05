package com.ssh.impl;

import java.util.List;

import org.hibernate.SessionFactory;

import com.ssh.domain.Singer;
import com.ssh.interfaces.SingerServiceInterface;

public class SingerService implements SingerServiceInterface {
	
	private SessionFactory sessionfactory;

	public void setSessionfactory(SessionFactory sessionfactory) {
		this.sessionfactory = sessionfactory;
	}

	@Override
	public List<Singer> getSingers() {
		String hql = "from Singer";
		@SuppressWarnings("unchecked")
		List<Singer> list = sessionfactory.getCurrentSession().createQuery(hql).list();
		return list;
	}
	
	public Singer getSinger(int id) {
		
		Singer singer = (Singer)sessionfactory.getCurrentSession().load(Singer.class,id);
		return singer;
	}

}
