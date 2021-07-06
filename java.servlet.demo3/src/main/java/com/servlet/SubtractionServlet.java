package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SubtractionServlet
 */
@WebServlet("/SubtractionServlet")
public class SubtractionServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstinp = request.getParameter("first");
		int firstNum = Integer.parseInt(firstinp);
		
		String secondinp = request.getParameter("second");
		int seconNum = Integer.parseInt(secondinp);
		
		double sub = firstNum - seconNum;
		System.out.println(sub);
		
		request.setAttribute("outcome", sub);
		
//		RequestDispatcher rd = request.getRequestDispatcher("add.jsp");
//		rd.forward(request, response);
		
		request.getRequestDispatcher("subtraction.jsp").forward(request, response);
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
