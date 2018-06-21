package com.aaa.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aaa.entity.EasyuiPage;
import com.aaa.entity.Users;
import com.aaa.service.EmployeesService;

@Controller
@RequestMapping("emp")
public class EmployeesController {

	@Autowired
	private EmployeesService empService;

	@RequestMapping("queryPage")
	@ResponseBody
	public EasyuiPage queryPage(int page, int rows) {
		List<Map<String, Object>> list = empService.queryPage(page, rows);
		int total = empService.queryPage(null, null).size();
		return new EasyuiPage(list, total);
	}

	@RequestMapping("queryAll")
	@ResponseBody
	public List<Map<String, Object>> queryAll() {
		return empService.queryPage(null, null);
	}

	@RequestMapping("getLogUsers")
	@ResponseBody
	public Map<String, Object> getLogUsers(HttpSession session) {
		Users user = (Users) session.getAttribute("logUser");
		return empService.getLogUser(user.getUid());
	}
}
