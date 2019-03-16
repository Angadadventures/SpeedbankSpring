<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> SpeedBank | Create Account</title>
</head>
<body>
	<center>
		<h1 style="color: #0066CC">Welcome to SpeedBank Application</h1>
		<br />
		<br />

		<!--This code below displays the form to add a trainee to the database	-->
		<h3>Please Enter the Customer Details</h3>
		<form:form action="createAccount.obj" method="post" modelAttribute="customer">
			<table bgcolor="#DCDCDC">

				<tr>
					<td>Customer Name:<span style="color: red;">*</span></td>
					<td><form:input path="cusName" /></td>
					<td style="color: red;"><form:errors path="cusName"></form:errors></td>

				</tr>

				<tr>
					<td>Customer Address : <span style="color: red;">*</span></td>
					<td><form:input path="cusAddress" /></td>
					<td style="color: red;"><form:errors path="cusAddress"></form:errors></td>

				</tr>

				<tr>
					<td>Customer Phone Number : <span style="color: red;">*</span></td>
					<td><form:input path="cusPhNo" /></td>
					<td style="color: red;"><form:errors path="cusPhNo"></form:errors></td>

				</tr>
				
				<tr>
					<td>Customer Email Id : <span style="color: red;">*</span></td>
					<td><form:input path="cusEmail" /></td>
					<td style="color: red;"><form:errors path="cusEmail"></form:errors></td>

				</tr>
				<tr>
					<td>Opening Balance:<span style="color: red;">*</span></td>
					<td><form:input path="cusBalance" type="number" min="500" /></td>
					<td style="color: red;"><form:errors path="cusBalance"></form:errors></td>

				</tr>
			
				<tr>
					<td colspan="2"><input type="submit" name="submit"
						value=" Create Account "></input></td>
				</tr>
			</table>

		</form:form>
		<br> <a href="menu.obj">Back To HomePage</a>
	</center>
</body>
</html>