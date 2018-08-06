<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>



<html>

<head>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular.min.js"></script>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login V3</title><html>

<head>
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular.min.js"></script>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User login</title>
</head>
<body>
<div ng-app="">
<form method="post" action="/verify-driver">
<a href="/show">Show users</a>&nbsp;
<a href="/login">Login</a><br/>

<c:if test="${not empty error}">
 <div class="alert alert-danger">
 <font color="red">
<c:out value="${error}"></c:out>
</font>
</c:if>

<br/>Username:<input type="text" name="email" value="${driver.email}"/><br/>
Password:<input type="password" name="password" value="${driver.password}"/><br/>
<input type="submit" value="Login"/>

</form>
</div>
</body>


</html>


