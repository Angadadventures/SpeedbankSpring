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
		<h2 style="color: #0066CC">${message}</h2>
		<h1 style="color: navy;">MAIN MENU | SpeedBank</h1>
		<table border="1px">
			<tr>
				<td><h3>
						Services :
						</h2></td>
			</tr>
			<tr>
				<td><a href="createAccountForm.obj"> Create New Account </a></td>
			</tr>
			<tr>
				<td><a href="showBalanceForm.obj"> Show Balance </a></td>
			</tr>
			<tr>
				<td><a href="depositAccountForm.obj"> Deposit Amount </a></td>
			</tr>
			<tr>
				<td><a href="withdrawAccountForm.obj"> Withdraw Amount </a></td>
			</tr>


		</table>
	</center>
</body>
</html>