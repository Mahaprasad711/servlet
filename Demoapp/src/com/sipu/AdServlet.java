package com.sipu;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse; 
import java.io.*;

public class AdServlet 
extends HttpServlet
{
		public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
		{
			int i= Integer.parseInt(req.getParameter("num1"));
			int j= Integer.parseInt(req.getParameter("num2"));
			int k =i + j;
			
			res.getWriter().println("result is"+ " " + k);
		}
}
