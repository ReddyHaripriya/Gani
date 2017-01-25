package com.mms.admin;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class AuditFilter implements Filter {
	
	String defaultUser = null;
	int counter = 0;

	public void init(FilterConfig filterConfig) throws ServletException {
		defaultUser = filterConfig.getInitParameter("defaultUser");
		System.out.println("default user " + defaultUser);

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException { 
		  System.out.println("this message is from AuditFilter");
		  request.setAttribute("fromFilter", "AuditFilter");
		  counter = counter + 1;
		  
		  System.out.println("number of times request came to admission servlet" + counter);
		  System.out.println("firstName from input request " + request.getParameter("firstname"));
		  request.setAttribute("firstname", "Neelima");
		 
		  
		  chain.doFilter(request, response);

	}

	public void destroy() {
		// TODO Auto-generated method stub

	}

}
