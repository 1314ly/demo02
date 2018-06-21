package com.aaa.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aaa.dao.EmployeesDao;

/**
 * 
 * @author S
 * @see 员工管理业务逻辑层
 */
@Service
@Transactional
public class EmployeesService {

	@Autowired
	EmployeesDao empDao;

	public List<Map<String, Object>> queryPage(Integer pageNum, Integer pageSize) {
		Integer offset = null;
		if (pageNum != null) {
			offset = (pageNum - 1) * pageSize;
		}
		return empDao.queryPage(offset, pageSize);
	}

	public Map<String, Object> getLogUser(Integer uid) {
		return empDao.getLogUser(uid);
	}
}
