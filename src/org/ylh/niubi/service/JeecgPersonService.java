package org.ylh.niubi.service;

import org.apache.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.base.service.BaseService;
import org.ylh.niubi.dao.JeecgPersonDao;


@Service("jeecgPersonService")
public class JeecgPersonService<T> extends BaseService<T> {
	private final static Logger log= Logger.getLogger(JeecgPersonService.class);
	

	

	@Autowired
    private JeecgPersonDao<T> dao;

		
	public JeecgPersonDao<T> getDao() {
		return dao;
	}

}
