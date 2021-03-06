package com.aaa.intercepter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class Demo2Intercepter implements HandlerInterceptor {

	/**
	 * 处理器(方法)调用之前执行
	 * 
	 * 返回值：
	 */
	@Override
	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2) throws Exception {
		System.out.println("demo02preHandle");
		return true;
	}

	/**
	 * 处理器返回ModelAndView之后,视图解析器处理之前之前调用当前方法
	 */
	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
		System.out.println("demo02postHandle");
	}

	/**
	 * 返回响应到客户端之前进行调用
	 */
	@Override
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		System.out.println("demo02afterCompletion");
	}

}
