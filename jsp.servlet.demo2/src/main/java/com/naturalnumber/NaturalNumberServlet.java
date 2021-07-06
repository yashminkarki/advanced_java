package com.naturalnumber;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NaturalNumberServlet
 */
@WebServlet("/NaturalNumberServlet")
public class NaturalNumberServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String num = request.getParameter("number");
		int num1 = Integer.parseInt(num);
		
		String naturalNum = " ";
		for(int i = 1; i <= num1; i++) {
			naturalNum = naturalNum + i + " ";
		}
		
		System.out.println(naturalNum);
		
		request.setAttribute("output", naturalNum);
		
		RequestDispatcher rd = request.getRequestDispatcher("outcome.jsp");
		rd.forward(request, response);
		
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
