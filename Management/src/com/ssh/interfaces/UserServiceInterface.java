package com.ssh.interfaces;

import java.util.List;

import com.ssh.domain.Users;

public interface UserServiceInterface {
	
	public void addUser(Users user);
	
	public List<Users> showUsers();
	
	public void updateUser();
	
	public void deleteUser(java.io.Serializable id);
	
	public Users checkUser(Users user);

}
