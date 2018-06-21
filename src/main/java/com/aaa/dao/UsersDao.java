package com.aaa.dao;

import java.util.List;
import java.util.Map;

import com.aaa.entity.Users;

public interface UsersDao {

	public List<Users> checkUser(Users u);

	public List<Map<String, Object>> queryPage(Users u, Integer offset,
			Integer rows);

	public int dels(int[] ids);

	public int add(Users u);

	public List<Map<String, Object>> test();
}
