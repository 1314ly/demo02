package com.aaa.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaa.dao.RolesDao;

/**
 * 
 * @author S
 * @see 角色管理业务逻辑层
 */
@Service
public class RolesService {

	@Autowired
	RolesDao rolesDao;

	public List<Map<String, Object>> queryAll() {
		return rolesDao.queryAll();
	}

}
