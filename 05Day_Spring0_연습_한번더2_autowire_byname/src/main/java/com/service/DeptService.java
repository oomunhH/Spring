package com.service;

import java.util.List;

import com.dao.DeptDAO;

public class DeptService {
	private String driver;
	private String url;
	private String username;
	private String passwd;
	DeptDAO dao;
	public DeptService() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DeptService(DeptDAO dao) {
		super();
		this.dao = dao;
	}
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	
	public DeptDAO getDao() {
		return dao;
	}
	public void setDao(DeptDAO dao) {
		this.dao = dao;
	}
	@Override
	public String toString() {
		return "DeptService [driver=" + driver + ", url=" + url + ", username=" + username + ", passwd=" + passwd
				+ ", dao=" + dao + "]";
	}
	
	public List<String> list(){
		
		return dao.list();
	}

	
	
}
