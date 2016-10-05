package com.ssh.interfaces;

import java.util.List;

public interface PageServiceInterface {
	
	List<Object> getPageElements(int pagenum, int number, List<Object> list);
	
	int getPageNumber(int number, int total);

}
