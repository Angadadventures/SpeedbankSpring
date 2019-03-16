<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%> 
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
 <h1 style="color:red"></h1>
	<h2>Show Balance Form</h2>
	<form action="showBalance.obj" method="post" >
		Enter Customer Id: <input type="number" name="cusAccNo">
		<input type="submit" value="Submit">
	</form>
 
	<h5> balance is ${balance} </h5> 
	<br> <a href="menu.obj">Back To HomePage</a>
</center>
</body>
</html>