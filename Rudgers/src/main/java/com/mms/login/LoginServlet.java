package com.mms.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {
public void doGet(HttpServletRequest request,HttpServletResponse response){
	response.setContentType("text/html");
	String username=request.getParameter("user");
	String password=request.getParameter("password");
	HttpSession session=request.getSession(true);
	if(!username.isEmpty())
	{
		session.setAttribute("username", username);
	}
	

		PrintWriter out;
		try {
			out = response.getWriter();
			out.println("Welcome <br>");
			out.println("Username from servlet is:"+session.getAttribute("username"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
	
	
}
}
