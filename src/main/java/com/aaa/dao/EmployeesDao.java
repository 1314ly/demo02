package com.aaa.dao;

import java.util.List;
import java.util.Map;

/**
 * 
 * @author S
 * @see 员工管理对应操作
 */

public interface EmployeesDao {

	public List<Map<String, Object>> queryPage(Integer offset, Integer pageSize);

	// 获取登陆用户的详细信息
	public Map<String, Object> getLogUser(Integer uid);

}
