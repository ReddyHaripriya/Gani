package com.mms.login;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class LoginFilter implements Filter {
String defaultUser=null;
int counter=0;
	public void init(FilterConfig filterConfig) throws ServletException {
		defaultUser=filterConfig.getInitParameter("defaultUser");
		System.out.println("default user " + defaultUser);
		

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("this message is from LoginFilter");
		  request.setAttribute("fromFilter", "LoginFilter");
		  counter = counter + 1;
		  System.out.println("number of times request came to login servlet" + counter);
		  System.out.println("user from input request " + request.getParameter("user"));
		  request.setAttribute("user", "hari");
		  
chain.doFilter(request, response);
	}

	public void destroy() {
		// TODO Auto-generated method stub

	}

}
