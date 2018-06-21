package com.aaa.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaa.dao.UsersDao;
import com.aaa.entity.Users;

@Service
public class UsersService {

	@Autowired
	private UsersDao userdao;

	// 登陆校验用户名密码
	public int checkUsers(Users u, HttpSession session) {
		List<Users> list = userdao.checkUser(u);
		if (list.size() == 1) {
			session.setAttribute("logUser", list.get(0));
			return 0;// 用户名密码正确
		} else if (list.size() > 1) {
			return 1;// 账号异常
		} else {
			return 2;// 登陆失败
		}
	}

	// 查询用户信息
	public List<Map<String, Object>> queryUsers(Users u, Integer page,
			Integer rows) {
		Integer offset = null;
		if (null != page) {
			offset = (page - 1) * rows;
		}
		return userdao.queryPage(u, offset, rows);
	}

	public int dels(int[] ids) {
		int rs = userdao.dels(ids);
		if (rs == ids.length) {
			return 0;// 成功
		} else {
			return -1;// 失败
		}
	}

	public int add(Users u) {
		return userdao.add(u);
	}

}
