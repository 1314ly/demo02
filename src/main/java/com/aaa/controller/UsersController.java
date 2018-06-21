package com.aaa.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aaa.entity.EasyuiPage;
import com.aaa.entity.Users;
import com.aaa.service.UsersService;

@Controller
@RequestMapping("users")
public class UsersController {

	@Autowired
	private UsersService userService;

	@RequestMapping("checkUsers")
	@ResponseBody
	public int checkUsers(Users user, HttpSession session) {
		System.out.println(user);
		return userService.checkUsers(user, session);
	}

	@RequestMapping("queryUsers")
	@ResponseBody
	public EasyuiPage queryUsers(Users u, Integer page, Integer rows) {
		return new EasyuiPage(userService.queryUsers(u, page, rows),
				userService.queryUsers(u, null, null).size());
	}

	@RequestMapping("dels")
	@ResponseBody
	public int dels(int[] ids) {
		return userService.dels(ids);
	}

	@RequestMapping("add")
	@ResponseBody
	public int add(Users u) {
		System.out.println(u.toString());
		return userService.add(u);
	}
}
