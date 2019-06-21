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
 * Servlet implementation class RohitServlet2
 */
@WebServlet("/servlet2")
public class RohitServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RohitServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
					response.setContentType("text/html");
					PrintWriter out = response.getWriter();
					
					String firstName = request.getParameter("fname");
					String lastName = request.getParameter("lname");
					String course = request.getParameter("userCourse");
					String address = request.getParameter("userAdd");
					String contact = request.getParameter("userContact");
					String email = request.getParameter("uEmail");
					
					DataAccess1 d2 = new DataAccess1();
					boolean b = d2.registartion(firstName, lastName, course, address, contact, email);
					
					if(b) {
						RequestDispatcher rd = request.getRequestDispatcher("File2.jsp");
						rd.forward(request, response);
					}
					else {
						out.print(" Error!......Records not inserted");
						RequestDispatcher req = request.getRequestDispatcher("RohitFile1.jsp");
						req.include(request, response);
					
					}

  }
}
