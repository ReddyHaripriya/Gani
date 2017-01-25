package com.mms.admin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AdmissionServlet extends HttpServlet {
	
public void doGet(HttpServletRequest request,HttpServletResponse response){
	response.setContentType("text/html");
	PrintWriter out;
	String fname=request.getParameter("firstname");
	String lname=request.getParameter("lastname");
	String gender=request.getParameter("gender");
	String age=request.getParameter("age");
	String email=request.getParameter("email");
	//String email=request.getParameter("email");
	
	try {
		out = response.getWriter();
		
		out.println("welcome to Rudger's "+fname+ " " + lname );
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	public void doPost(HttpServletRequest request,HttpServletResponse response){
		response.setContentType("text/html");
		PrintWriter out;
		String fname=request.getParameter("firstname");
		String lname=request.getParameter("lastname");
		String gender=request.getParameter("gender");
		String age=request.getParameter("age");
		String email=request.getParameter("email");
		//String email=request.getParameter("email");
		String[] subjects=request.getParameterValues("subject");
		
		HttpSession session = request.getSession(true);
		ServletContext context = request.getServletContext();
		
		if(!fname.isEmpty())
		{
			session.setAttribute("firstName", fname);
		}
		
		if(!lname.isEmpty())
		{
			context.setAttribute("lastName", lname);
		}
		
		try {
			out = response.getWriter();
			
			out.println("welcome to Rudger's "+fname+ " " + lname );
			out.println("Your details Name:"+fname+ " " + lname+ 
					"Gender" +gender+"age"+age+"Email:"+email);
			
			out.println("Thank You for choosing Rudger's ");
			out.println("first name from session" + session.getAttribute("firstName"));
			
			out.println("last  name from servlet context" + context.getAttribute("lastName"));
			out.println("from filter " + context.getAttribute("fromFilter"));
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
}
}
