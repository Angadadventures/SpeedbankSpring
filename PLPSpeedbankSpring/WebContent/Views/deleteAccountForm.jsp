<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
 <h1 style="color:red">${message}</h1>
	<h2>Delete trainee form</h2>
	<form action="deleteCustomer.obj" method="post">
		Enter Customer Id: <input type="number" name="traineeId">
		<input type="submit" value="Delete">
	</form>
	<br> <a href="menu.obj">Back To HomePage</a>
</center>
</body>
</html>