/**@Umang shaw 
 * login page by sending req, res object to another servlet if the password is correct and displaying the user */

package shaw.umang;


import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Getparam extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)   
		     throws IOException,ServletException{
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			String n=request.getParameter("username");
			String p=request.getParameter("password");
			
			if(p.equals("password")) {                       //checking for password 
			RequestDispatcher rd=request.getRequestDispatcher("servlet2"); //sending req, res to servlet2
			rd.include(request, response);
			}else {
				out.println("Please enter the correct password");

				RequestDispatcher rd=request.getRequestDispatcher("Navigation.html"); //going back to login page
				rd.include(request, response);
			}
	
	

    }

}
