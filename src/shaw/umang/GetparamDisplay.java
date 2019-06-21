package shaw.umang;



import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class GetparamDisplay extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
		     throws IOException,ServletException{
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			String n=request.getParameter("username");
			out.println("Welcome "+n);
			
	}

}
