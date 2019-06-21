package com.login.chethan;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		String name=request.getParameter("username");
		String pass=request.getParameter("password");
		PrintWriter pw = response.getWriter();
		if(name.equals("chethan") && pass.equals("chethan123"))
		{
			RequestDispatcher dis = request.getRequestDispatcher("welcome.html");
			dis.forward(request, response);
		}
		else
		{	    
			RequestDispatcher dis = request.getRequestDispatcher("login.html");
			dis.include(request, response);
			pw.print("User name or password is incorrect!");  
		}
	}
}
		