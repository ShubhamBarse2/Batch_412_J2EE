package com.service;

import com.dao.StudentDao;

public class StudentService {

	public void insertData() throws Exception {
		StudentDao sd = new StudentDao();
		sd.insertData();
	}

	public void updateData() throws Exception {
		StudentDao sd = new StudentDao();
		sd.updateData();
		
	}

}
