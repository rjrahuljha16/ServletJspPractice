<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body {
background-color: #000;
}

h1{
margin:0 40%;
color:#efc03e;
}
form{
margin:5% 40%;

}

input[type=submit]{width:150px;background-color: #efc03e;display: inline-block; border:1px solid transparent;border-radius: 8px;
  font-size: 16px;}
</style>
</head>
<body>
<h1>Login Page</h1>

<form class="a" action="servlet1" method="post">
	<input type="text" name="username" placeholder="Username"/><br>
	<input type="password" name="password" placeholder="Password"/><br>
	<input type="submit" value="Login"/>
</form>

</body>
</html>