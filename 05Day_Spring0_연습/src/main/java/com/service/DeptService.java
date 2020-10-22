package com.service;

import java.util.List;

import com.dao.DeptDAO;

public class DeptService {
	
	private String driver;
	private String url;
	private String userid;
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



	public List<String> list(){
		
		return dao.list();
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

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	@Override
	public String toString() {
		return "DeptService [driver=" + driver + ", url=" + url + ", userid=" + userid + ", passwd=" + passwd + "]";
	}
	
	
}
