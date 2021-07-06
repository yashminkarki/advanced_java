package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MultiplyServlet
 */
@WebServlet("/MultiplyServlet")
public class MultiplyServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String firstInput = request.getParameter("num1");
		int number1 = Integer.parseInt(firstInput);
		
		String secondInput = request.getParameter("num2");
		int number2 = Integer.parseInt(secondInput);
		
		int mult = number1 * number2;
		System.out.println(mult);
		
		request.setAttribute("result", mult);
		
		request.getRequestDispatcher("multiply.jsp").forward(request, response);
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
