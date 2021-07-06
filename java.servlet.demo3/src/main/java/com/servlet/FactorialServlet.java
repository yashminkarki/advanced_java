package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FactorialServlet
 */
@WebServlet("/Yashmin")
public class FactorialServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String number = request.getParameter("num");
		int num = Integer.parseInt(number);
		
		int fact = 1;
		for(int i = 1; i<=num; i++) {
			fact = fact * i;
			
		}
		
		System.out.println(fact);
		
		request.setAttribute("result", fact);
		
		RequestDispatcher rd = request.getRequestDispatcher("fact.jsp"); //forwarding the request to another resource
		rd.forward(request, response);
	
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
