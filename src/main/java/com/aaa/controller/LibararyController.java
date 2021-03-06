package com.aaa.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aaa.entity.EasyuiPage;
import com.aaa.entity.TreeNode;
import com.aaa.entity.Users;
import com.aaa.service.LibararyService;

@Controller
@RequestMapping("lib")
public class LibararyController {

	@Autowired
	private LibararyService libService;

	@RequestMapping("getTree")
	@ResponseBody
	public List<TreeNode> getTree() {
		return libService.getTree();
	}

	@RequestMapping("getTreeByRid")
	@ResponseBody
	public List<TreeNode> getTreeByRid(HttpSession session) {
		Users u = (Users) session.getAttribute("logUser");
		return libService.getTreeByRid(u.getRid());
	}

	@RequestMapping("queryPage")
	@ResponseBody
	public EasyuiPage queryPage(Integer page, Integer rows) {
		return new EasyuiPage(libService.queryPage(page, rows), libService
				.queryPage(null, null).size());
	}

	@RequestMapping("queryAll")
	@ResponseBody
	public List<Map<String, Object>> queryAll() {
		return libService.queryPage(null, null);
	}

	// 接收json字符串
	@RequestMapping("addNode")
	@ResponseBody
	public boolean addNode(@RequestBody Map<String, Object> node) {
		return libService.addNode(node);
	}
}
