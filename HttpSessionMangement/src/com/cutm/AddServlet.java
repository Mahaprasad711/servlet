package com.cutm;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AddServlet
 */
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;//Default serial id 

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int i053 = Integer.parseInt(request.getParameter("num1053"));//variable created
		int j053 = Integer.parseInt(request.getParameter("num2053"));//variable created
		int k053 = i053 + j053;// add two numbers
		HttpSession session=request.getSession();//session 
		session.setAttribute("k053", k053);
		
		
	}

}

