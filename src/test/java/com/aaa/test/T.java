package com.aaa.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.aaa.util.EasyuiTreeUtil;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:applicationContext.xml",
		"classpath:spring-mvc.xml" })
public class T {

	@Autowired
	EasyuiTreeUtil tree;

	@Test
	public void m1() {
		// tree.getTree(0);
	}
}
