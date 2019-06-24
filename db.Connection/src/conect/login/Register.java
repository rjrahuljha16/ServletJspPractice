

package conect.login;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Register extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)   
		     throws IOException,ServletException{
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			String e=request.getParameter("empid");
			String f=request.getParameter("fullname");
			String c=request.getParameter("college");
			String p=request.getParameter("phone");
			String u=request.getParameter("username");
			String pw=request.getParameter("password");
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle123");
				PreparedStatement stmt = con.prepareStatement("insert into auth values(?,?,?,?,?,?)");
				stmt.setInt(1,(Integer.parseInt(e)));
				stmt.setString(2, f);
				stmt.setString(3, c);
				stmt.setInt(4,Integer.parseInt(p));
				stmt.setString(5, u);
				stmt.setString(6, pw);
				int a=stmt.executeUpdate();
				if(a>0) {
					out.print("Registered successfully, Please Login ");
					request.getRequestDispatcher("Login.html").include(request, response);
				}else {
					response.sendRedirect("index.html");
				}
					
			con.close();
	} catch(Exception err) {
	out.print(err);
	}
			}

	private int parseInt(String e) {
		// TODO Auto-generated method stub
		return 0;
	}
			
			
	}


