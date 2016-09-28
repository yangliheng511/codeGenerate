package org.ylh.niubi.service;

import org.apache.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.base.service.BaseService;
import org.ylh.niubi.dao.TeacherDao;


@Service("teacherService")
public class TeacherService<T> extends BaseService<T> {
	private final static Logger log= Logger.getLogger(TeacherService.class);
	

	

	@Autowired
    private TeacherDao<T> dao;

		
	public TeacherDao<T> getDao() {
		return dao;
	}

}
