package com.cookies.chethan;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 102831973239L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
	
	   PrintWriter out = response.getWriter();   
	   String n = request.getParameter("username");
	   out.println("Hello "+n);
	   
	   Cookie ck= new Cookie("uname",n);
	   response.addCookie(ck);

	   out.print("<form action='servlet2' method='post'>");  
	   out.print("<input type='submit' value='Profile'>");  
	   out.print("</form>"); 
	   
	   out.print("<form action='servlet3' method='post'>");  
	   out.print("<input type='submit' value='Logout'>");  
	   out.print("</form>"); 

	   out.close();

	  }  
	}  