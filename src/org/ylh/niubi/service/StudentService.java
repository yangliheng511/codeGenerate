package org.ylh.niubi.service;

import org.apache.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.base.service.BaseService;
import org.ylh.niubi.dao.StudentDao;


@Service("studentService")
public class StudentService<T> extends BaseService<T> {
	private final static Logger log= Logger.getLogger(StudentService.class);
	

	

	@Autowired
    private StudentDao<T> dao;

		
	public StudentDao<T> getDao() {
		return dao;
	}

}
