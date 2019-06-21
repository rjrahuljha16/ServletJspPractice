package com.srs.rohit1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.rohit1.DataAccess1;

/**
 * Servlet implementation class RohitServlet
 */
@WebServlet("/servlet")
public class RohitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public RohitServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String userEmail = request.getParameter("usermail");
		String userPwd = request.getParameter("userpwd");
		
		DataAccess1 d = new DataAccess1();
		boolean result = d.authenticate(userEmail, userPwd);
		
		if(result == true) {
			RequestDispatcher req1 = request.getRequestDispatcher("RohitFile1.jsp");
			req1.forward(request, response);
		}
		else {
			pw.print("Sorry UserName or Password Error!");
			RequestDispatcher req = request.getRequestDispatcher("FileRohit1.html");
			req.include(request, response);
			
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			response.setContentType("text/html");
			PrintWriter pw = response.getWriter();
			String userEmail = request.getParameter("usermail");
			String userPwd = request.getParameter("userpwd");
			
			DataAccess1 d = new DataAccess1();
			boolean result = d.authenticate(userEmail, userPwd);
			
			if(result == true) {
				RequestDispatcher req1 = request.getRequestDispatcher("RohitFile1.jsp");
				req1.forward(request, response);
			}
			else {
				pw.print("Sorry UserName or Password Error!");
				RequestDispatcher req = request.getRequestDispatcher("FileRohit1.html");
				req.include(request, response);
				
			}
			
			
		
	}

}
