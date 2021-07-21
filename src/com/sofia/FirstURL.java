package com.sofia;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class FirstURL extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		try {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			
			String n=request.getParameter("id");
			
			out.print("Welcome" + n);
			
			out.print("<a href='urlwrite2?uname=" + n + "'> Visit </a>");
			
			out.close();
			
		}
		
	 catch(Exception e) {	
		 
		System.out.println(e);
		}
	}

}
