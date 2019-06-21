package com.rohan;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RohanServlet extends HttpServlet {
	
    public RohanServlet() {
        
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		    
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String Username= request.getParameter("Username");
		String Password= request.getParameter("Password");
		
		if(Username.equals("Rohan") && Password.equals("Duvva"))
		{
			out.println("<html><head><title>");
			out.println("RohanServlet");
			out.println("</title></head><body>");
			out.println("<center><h1>Welcome To Registration Page </h1></center>");
			out.println("<center><tr><td>Fullname:<input type=\"text\" name=\"Fullname\" size=21/></td></tr></center><br>");
			out.println("<center><tr><td>Lastname:<input type=\"text\" name=\"Lastname\" size=21/></td></tr></center><br>");
			out.println("<center><tr><td>Course:<input type=\"text\" name=\"Course\" size=21/></td></tr></center><br>");
			out.println("<center><tr><td>E-mail:<input type=\"text\" name=\"E-mail\" size=21/></td></tr></center><br>");
			out.println("<center><tr><td><input type=\"Submit\" name=\"Submit\"/></center>");
			out.println("</body></html>");
			
		}
		 
		else 
		{
			out.println("<html><head><title>");
			out.println("RohanServlet");
			out.println("</title></head><body>");
			out.println("Login Failed ");
			out.println("</body></html>");
			
		}
		
			
	}

}
