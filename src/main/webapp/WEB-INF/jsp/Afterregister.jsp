<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="#f0f6ff" align="center">
	<!-- <h1>Registration Successfully</h1> -->
	<c:if test="${not empty registerMsg}">
	<div class="alert alert-success" role="alert">${registerMsg}</div>
	</c:if> 
	<%-- <h2>${registerMsg}</h2> --%>
	<h2>Please click login</h2>
	<a href="afterregister"><button type="submit">Login</button></a>
</body>
</html>