<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri= "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>This is the multiplied product</title>
</head>
<body>
<p>${multipliedNumbers.getProduct()} is the product of the numbers you entered. <br />
</p>
<a href= "starter.jsp"> Enter two more numbers</a>
</body>
</html>