package com.aaa.intercepter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class Demo1Intercepter implements HandlerInterceptor {

	/**
	 * 处理器(方法)调用之前执行
	 * 
	 * 返回值：true,向下执行,false,结束
	 */
	@Override
	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2) throws Exception {
		System.out.println("demo01preHandle");
		System.out.println("arg2:" + arg2.getClass());
		HandlerMethod method = (HandlerMethod) arg2;
		System.out.println(method.getMethod().getName());
		System.out.println(method.getBeanType());
		System.out.println(arg0.getRequestURL());
		return true;
	}

	/**
	 * 处理器返回ModelAndView之后,视图解析器处理之前之前调用当前方法
	 */
	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
		System.out.println("demo01postHandle");
		// System.out.println(arg3.getModel().get("name"));
		// arg3.addObject("age", "12");
	}

	/**
	 * 返回响应到客户端之前进行调用
	 */
	@Override
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		System.out.println("demo01afterCompletion");
	}

}
