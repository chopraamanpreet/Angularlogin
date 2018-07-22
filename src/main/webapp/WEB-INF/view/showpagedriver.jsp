<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>

<head>
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular.min.js"></script>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Display</title>


<style>
table {
    font-family: arial, sans-serif;
    border-collapse: collapse;
    width: 100%;
}

td, th {
    border: 1px solid #dddddd;
    text-align: left;
    padding: 8px;
}

tr:nth-child(even) {
    background-color: #dddddd;
}
</style>
</head>

<body>
<h2>Driver data</h2>
<table>
<tr>
<td>Id</td>
<td>FirstName</td>
<td>LastName</td>
<td>Email</td>
<td>Contact</td>
<td>Gender</td>
<td>Address</td>
<td>Password</td>
<td>Delete</td>
<td>Edit</td>
</tr>

<c:forEach var="driver" items="${drivers}">
<tr>
<td>${driver.id}</td>
<td>${driver.firstname}</td>
<td>${driver.lastname}</td>
<td>${driver.email}</td>
<td>${driver.contact}</td>
<td>${driver.gender}</td>
<td>${driver.address}</td>
<td>${driver.password}</td>
<td><a href="/delete-user?id=${driver.id}">Delete</a>
<td><a href="/edit-user?id=${driver.id}">Edit</a>
</tr>
</c:forEach>

</table>
<h1>hello${driver.firstname}</h1>
</body>
</html>