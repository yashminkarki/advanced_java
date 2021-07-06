package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddServlet
 */
@WebServlet("/SumServlet")
public class AddServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String firstInput = request.getParameter("num1");
		int number1 = Integer.parseInt(firstInput);
		
		String secondInput = request.getParameter("num2");
		int number2 = Integer.parseInt(secondInput);
		
		int sum = number1 + number2;
		System.out.println(sum);
		
		request.setAttribute("result", sum);
		
//		RequestDispatcher rd = request.getRequestDispatcher("add.jsp");
//		rd.forward(request, response);
		
		request.getRequestDispatcher("add.jsp").forward(request, response);
		//response.sendRedirect("fact.jsp");
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
