<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SpeedBank | LOGIN </title>
</head>
<body>
	<center>
		<h1 style="color: #0066CC">Welcome to SpeedBank</h1>
		<br />
		<br />

		<!--This code below displays the form to log in	-->
		<h3>Please Enter the LogIn Details</h3>
		<form action="validateLogin.obj" method="post">
			Username: <input type="text" name="username" required>
			Password: <input type="password" name="password" required>
			<input type="submit" value="login">
		</form>
	</center>
</body>
</html>