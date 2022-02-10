<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Week4Assessment starter page</title>
</head>
<body>
	<h1>This is the starter page of the assessment</h1>
	<form action= "getTwoNumbersServlet" method= "post">
	Enter two numbers to add together:
	<input type= "text" name= "userNumber1" size= "10">
	<input type= "text" name= "userNumber2" size= "10">
	<input type= "submit" value= "Add Numbers" />
	</form>
	<form action= "getMultipliedNumberServlet" method= "post">
	Enter two numbers to multiply together:
	<input type= "text" name= "multNum1" size= "10">
	<input type= "text" name= "multNum2" size= "10">
	<input type= "submit" value= "Multiply Numbers" />
	</form>
</body>
</html>