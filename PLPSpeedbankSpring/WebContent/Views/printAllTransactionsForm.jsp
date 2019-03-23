<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%> 

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>All Trainees</title>
</head>
<body>
<center>
	<h2>Transactions</h2>
	<form action="printAllTransactionsForm.obj" method="post">
	Enter your Account Number to print transactions : <input type="number" name="cusAccNo">
	<input type="submit" value="Submit">
	</form>
	<table border="1px">
		<tr>
			<th bgcolor="bisque">ACCOUNT NUMBER </th>
			<th bgcolor="bisque">TRASANCTION ID</th>
			<th bgcolor="bisque">AMOUNT</th>
			<th bgcolor="bisque">TYPE</th>
			<th bgcolor="bisque">DATE</th>
		</tr>
	
		<c:forEach var="transactionsList" items="${transactions}">
			<tr>
				<td>${transactionsList.cusAccNo}</td>
				<td>${transactionsList.transactionId}</td>
				<td>${transactionsList.amount}</td>
				<td>${transactionsList.type}</td>
				<td>${transactionsList.thisdate}</td>
			</tr>
		</c:forEach>
	</table>
	<a href="menu.obj">Click
			Here To Go to Home</a>
</center>
</body>
</html>