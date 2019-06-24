<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
form{
margin:5% 40%;
}

input[type=submit]{width:150px;background-color: #efc03e;display: inline-block; border:1px solid transparent;border-radius: 8px;
  font-size: 16px;}

body{
background-color:#7a7361;}  
h4{
margin:0 40%;
}
</style>
</head>
<body>
<h4>REGISTER YOURSELF</h4>
<form action="Register" method="POST">
<input type="text" name="empid" placeholder="Empid"/><br>
<input type="text" name="fullname" placeholder="Fullname"/><br>
<input type="text" name="college" placeholder="College"/><br>
<input type="text" name="phone" placeholder="Phone"/><br>
<input type="text" name="username" placeholder="Username"/><br>
<input type="password" name="password" placeholder="Password"/><br>
<input type="submit" value="Register"/>


</form>

</body>
</html>