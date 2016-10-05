package com.ssh.test;


import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.ssh.domain.Musiclist;
import com.ssh.domain.Musics;
import com.ssh.domain.Users;
import com.ssh.interfaces.MusicListServiceInterface;
import com.ssh.interfaces.MusicServiceInterface;
import com.ssh.interfaces.UserServiceInterface;
import com.ssh.service.TestService;

public class test {
	private SessionFactory sessionfactory;
	
	public void setSessionfactory(SessionFactory sessionfactory) {
		this.sessionfactory = sessionfactory;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		/*ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		MusicServiceInterface msi = (MusicServiceInterface)ac.getBean("musicservice1");
		test t = (test)ac.getBean("test");
		Users user = new Users();
		user.setUserid(1);
		String hql = "from Users where userid='"+user.getUserid()+"'";
		List<Users> list = t.sessionfactory.openSession().createQuery(hql).list();
		List<Musics> list1 = msi.showMusics(list.get(0));
		if(list1!=null){
			System.out.println("ok");
		}
		else
			System.out.println("error");*/
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		MusicListServiceInterface mlsi = (MusicListServiceInterface)ac.getBean("musiclistservice1");
		MusicServiceInterface msi = (MusicServiceInterface)ac.getBean("musicservice1");
		test t = (test)ac.getBean("test");
		String hql = "from Musiclist";
		@SuppressWarnings("unchecked")
		List<Musiclist> list = t.sessionfactory.openSession().createQuery(hql).list();
		List<Musics> list2 = msi.listMusics(list.get(0));
		System.out.println(list2.get(0).getMusicname());

	}

}
