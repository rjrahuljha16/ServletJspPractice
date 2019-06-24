package conect.login;

import javax.servlet.*;
import java.sql.*;
import javax.servlet.http.*;
import java.io.*;

public class Dispalay extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)   
		     throws IOException,ServletException{
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
//			int e=Integer.parseInt(request.getParameter("empid"));
			String f=request.getParameter("username");
		    out.println("Welcome "+f+", Please verify your details");   
		    try {
		    	Class.forName("oracle.jdbc.driver.OracleDriver");  //registration page
		    	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle123");
		    	Statement stmt=con.createStatement();
		    	ResultSet rs=stmt.executeQuery("select Empid, Fullname, College, Phone, Username, Pass from auth");
		    	out.println("<table border=1 width=30% height=30%>");
	             out.println("<tr><th>EmpId</th><th>Name</th><th>College</th><th>Phone</th><th>Password</th><tr>");
		    	while(rs.next()) {
//		    		if(e.equals(rs.getInt(1))){
		    		if(f.equals(rs.getString(5))){
		    			int e=rs.getInt(1);
		    			String fu=rs.getString(2);
		    			String c=rs.getString(3);
		    			int p=rs.getInt(4);
		    			String pw=rs.getString(6);
		    			out.print("<tr><td>"+e+"</td><td>"+fu+"</td><td>"+c+"</td><td>"+p+"</td><td>"+pw+"</td></tr>");
		    		}
		    	}
		    }catch(Exception err) {
		out.print(err);	
		    }out.print("</table>");
	
	out.print("<form action='Delete' method='POST'>");
	out.println("<input type='submit' value='Delete'/>");
	out.println("</form>");
	}

}
