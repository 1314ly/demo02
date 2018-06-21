package com.aaa.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aaa.entity.Users;

@Controller
@RequestMapping("demo01")
public class Demo01Controller {

	@RequestMapping("m")
	@ResponseBody
	public String m() {
		return "error/500";
	}

	@RequestMapping("m1")
	@ResponseBody
	public boolean m1() {
		return true;
	}

	@RequestMapping("m2")
	@ResponseBody
	public int m2() {
		return 1;
	}

	@RequestMapping("m3")
	@ResponseBody
	public Users m3() {
		Users u = new Users();
		u.setUid(1001);
		u.setPwd("111");
		u.setUname("admin");
		return u;
	}

	@RequestMapping("m4")
	@ResponseBody
	public List<Users> m4() {
		Users u = new Users();
		u.setUid(1001);
		u.setPwd("111");
		u.setUname("admin");
		List<Users> list = new ArrayList<Users>();
		list.add(u);
		return list;
	}

	@RequestMapping("m5")
	@ResponseBody
	public Map<String, Object> m5() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", "tom");
		map.put("pwd", "123");
		return map;
	}

	@RequestMapping("m6")
	@ResponseBody
	public int[] m6() {
		int a[] = { 1, 2, 3 };
		return a;
	}

}
