<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success</title>
</head>
<body>

	<form action="servlet2" method="post">
			<h2>Welcome to Registration...</h2>
			<fieldset>
            	<legend>Registration Form</legend>
  				<pre>
  				First Name : <input type="text" name="fname"><br>
  				Last Name  : <input type="text" name="lname"><br><br>
  				Course     : <input type="text" name="userCourse"><br>
  				Address    : <input type="text" name="userAdd"><br><br>
  				Contact    : <input type="text" name="userContact"><br>
  				Email_Id   : <input type="email" name="uEmail"><br>
  							 <input type="submit" value="SAVE">
  				</pre>
 			</fieldset>
			
	</form>
</body>
</html>