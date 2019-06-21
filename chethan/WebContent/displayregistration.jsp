<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
</head>
<body>
<% 
out.println("First Name: " +request.getParameter("First_Name")+"<br>"); 
out.println("Last Name: " +request.getParameter("Last_Name")+"<br>");
out.println("Date of Birth: " +request.getParameter("date_of_birth")+"<br>");
out.println("Email Id: " +request.getParameter("Email_Id")+"<br>");
out.println("Mobile Number: " +request.getParameter("Mobile_Number")+"<br>");
out.println("Gender: " +request.getParameter("Gender")+"<br>");
out.println("Address: " +request.getParameter("Address")+"<br>");
out.println("City: " +request.getParameter("City")+"<br>");
out.println("Pin Code: " +request.getParameter("Pin_Code")+"<br>");
out.println("State: " +request.getParameter("State")+"<br>");
out.println("Country: " +request.getParameter("Country")+"<br>");
out.println("Hobbies: " +request.getParameter("Hobby") +"<br>");
out.println("Other_Hobby: " +request.getParameter("Other_Hobby")+"<br>");
out.println("Course: " +request.getParameter("Courses"));
%>
</body>
</html>