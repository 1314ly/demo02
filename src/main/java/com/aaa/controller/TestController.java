package com.aaa.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aaa.dao.UsersDao;
import com.aaa.entity.Users;

@Controller
@RequestMapping("test")
public class TestController {

	@Autowired
	private UsersDao dao;

	@RequestMapping("queryAll")
	@ResponseBody
	public List<Users> queryAll() {
		return dao.checkUser(null);
	}

	@RequestMapping("queryPage")
	@ResponseBody
	public List<Map<String, Object>> queryPage() {
		return dao.queryPage(null, null, null);
	}

	@RequestMapping("test")
	@ResponseBody
	public List<Map<String, Object>> test() {
		return dao.test();
	}

	@RequestMapping("intercepterMethod")
	public String intercepterMethod(Model m) {
		System.out.println("intercepterMethod");
		m.addAttribute("name", "admin");
		return "error/500";
	}

}
