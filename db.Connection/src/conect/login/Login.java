/**@Umang 
 * Signup and login page
 * using servlet and jsp  */


package conect.login;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class Login extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)   
		     throws IOException,ServletException{
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			String u=request.getParameter("username");
		    String p=request.getParameter("password");
		
			try {
				 
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle123");
				PreparedStatement stmt = con.prepareStatement("select * from auth where Username=? and Pass=?");
				stmt.setString(1, u);
				stmt.setString(2, p);
				ResultSet rs=stmt.executeQuery();
				if(rs.next()) {
					RequestDispatcher rd=request.getRequestDispatcher("servlet2");
				    rd.include(request, response);
					}else{
						out.print("Please enter the correct password");
					    request.getRequestDispatcher("Login.html").include(request,response);
					}
				
				con.close();
				} catch(Exception e) {
				out.print(e);
				}
			
			
	
	}

}
