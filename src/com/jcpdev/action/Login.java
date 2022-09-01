package com.jcpdev.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//서블릿은 http 요청을 처리하는 자바 클래스입니다. HttpServlet을 상속받습니다.
public class Login extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
				                                    throws ServletException, IOException {
			// TODO Auto-generated method stub
			super.doGet(req, resp);
		}
}
