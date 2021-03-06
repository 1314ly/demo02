package com.aaa.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aaa.dao.LibararyDao;
import com.aaa.entity.TreeNode;
import com.aaa.util.EasyuiTreeByRidUtil;
import com.aaa.util.EasyuiTreeUtil;

@Service
@Transactional
public class LibararyService {

	@Autowired
	EasyuiTreeUtil util;

	@Autowired
	EasyuiTreeByRidUtil treeutil;

	@Autowired
	LibararyDao libararydao;

	public List<TreeNode> getTree() {
		return util.getTree(0);
	}

	public List<TreeNode> getTreeByRid(Integer rid) {
		return treeutil.getTree(0, rid);
	}

	public List<Map<String, Object>> queryPage(Integer page, Integer rows) {
		Integer offset = null;
		if (page != null) {
			offset = (page - 1) * rows;
		}
		return libararydao.queryPage(page, rows);
	}

	public boolean addNode(Map<String, Object> node) {
		int i = libararydao.addNode(node);
		if (i == 1) {
			return true;
		} else {
			return false;
		}
	}

}
