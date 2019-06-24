package conect.login;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class Delete extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)   
		     throws IOException,ServletException{
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			String f=request.getParameter("username");
		    
		
			try {
			
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle123");
				PreparedStatement stmt = con.prepareStatement("delete from auth where Username=?");
				stmt.setString(1,f);
				int d=stmt.executeUpdate();
				if(d>0) { 
                    System.out.println(d);
					request.getRequestDispatcher("Login.jsp").forward(request, response);
				}
				
				con.close();
				} catch(Exception e) {
				out.print(e);
				}
			
			
	
	}

}
