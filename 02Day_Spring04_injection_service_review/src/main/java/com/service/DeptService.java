package com.service;

import java.util.List;

import com.dao.DeptDAO;

public class DeptService {
	DeptDAO dao;

	public DeptService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DeptService(DeptDAO dao) {
		super();
		System.out.println("DeptService 생성자 호출됨!!!=========>"+dao);
		this.dao = dao;
	}
	
	public List<String> list(){
		System.out.println("DeptService에 있는 list() 함수 호출 되는 중!!!======="+dao.list());
		return dao.list();
	}
}
