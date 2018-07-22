<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular.min.js"></script>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit</title>
</head>
<body>
<div ng-app="">
<form method="post" action="insert">
<a href="/show">Show drivers</a><br/>
<input type="hidden" name="id" value="${driver.id}"/><br/>
Username:<input type="text" name="email" value="${driver.email}"/><br/>
Password:<input type="password" name="password" value="${driver.password}"/><br/>
<input type="submit" value="Update"/>

</form>
</div>
</body>


</html>
