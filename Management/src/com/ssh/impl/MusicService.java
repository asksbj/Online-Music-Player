package com.ssh.impl;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.ssh.domain.Items;
import com.ssh.domain.Musiclist;
import com.ssh.domain.Musics;
import com.ssh.domain.Mymusics;
import com.ssh.domain.Singer;
import com.ssh.domain.Users;
import com.ssh.interfaces.MusicServiceInterface;

@Transactional
public class MusicService implements MusicServiceInterface {
	
	private SessionFactory sessionfactory;

	public void setSessionfactory(SessionFactory sessionfactory) {
		this.sessionfactory = sessionfactory;
	}

	@Override
	public List<Musics> showMusics(Users user) {
		// TODO Auto-generated method stub
		List<Musics> mylist = new ArrayList<Musics>();
		
		for(Mymusics mymusic:user.getMymusics()){
			mylist.add(mymusic.getMusics());
		}
		return mylist;
	}
	
	public Musics getMusic(int musicid) {

		Musics music = (Musics)sessionfactory.getCurrentSession().load(Musics.class,musicid);
		return music;
	}

	@Override
	public List<Musics> listMusics(Musiclist musiclist) {
		// TODO Auto-generated method stub
		List<Musics> musics = new ArrayList<Musics>();
		
		for(Items item:musiclist.getItemses()){
			musics.add(item.getMusics());
		}
		return musics;
	}

	@Override
	public String getListpath(Musiclist musiclist) {
		// TODO Auto-generated method stub
		File file = new File("d:/music/"+musiclist.getListname()+".m3u");
		FileWriter fw;
		if(!file.exists()){
			try {		
				fw = new FileWriter(file);
				for(Items item:musiclist.getItemses()){
					String path = item.getMusics().getMusicpath();
					fw.write(path);
					fw.write("\n");
				}
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
		return file.getPath();
	}

	@Override
	public List<Musics> getMusicbySinger(Singer singer) {
		// TODO Auto-generated method stub
		List<Musics> list = new ArrayList<Musics>();
		for(Musics music:singer.getMusicses())
			list.add(music);
		
		return list;
	}

	@Override
	public String getSingerpath(Singer singer) {
		// TODO Auto-generated method stub
		File file = new File("d:/music/"+singer.getSingername()+".m3u");
		FileWriter fw;
		if(!file.exists()){
			try {		
				fw = new FileWriter(file);
				for(Musics music:singer.getMusicses()){
					String path = music.getMusicpath();
					fw.write(path);
					fw.write("\n");
				}
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
		return file.getPath();
	}

}
