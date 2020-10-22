package com.service;

import java.util.List;

import com.dao.DeptDAO;

public class DeptService {
	DeptDAO dao;
	
	public DeptService(DeptDAO dao) {
		super();
		this.dao = dao;
	}

	public DeptService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<String> list(){
		
		return dao.list();
	}
	

	
	
}
