package com.ssh.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.ssh.domain.Users;
import com.ssh.interfaces.UserServiceInterface;

//let spring transaction manager takes control of all transactions in this service
@Transactional
public class UserService implements UserServiceInterface {
	
	//@Resource
	private SessionFactory sessionfactory;

	public void setSessionfactory(SessionFactory sessionfactory) {
		this.sessionfactory = sessionfactory;
	}

	@Override
	public void addUser(Users user) {
		// TODO Auto-generated method stub
		sessionfactory.getCurrentSession().save(user);

	}

	@Override
	public List<Users> showUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateUser() {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteUser(Serializable id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Users checkUser(Users user) {
		// TODO Auto-generated method stub
		String hql = "from Users where username='"+user.getUsername()+"' and password='"+user.getPassword()+"'";
		@SuppressWarnings("unchecked")
		List<Users> list = sessionfactory.getCurrentSession().createQuery(hql).list();
		//Hibernate.initialize(proxy); //pre-process select
		if(list.size()==1)
			return list.get(0);
		else
			return null;
	}

}
