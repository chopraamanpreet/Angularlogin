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
<h2>Trip data</h2>
<a href="/logout" class="btn btn-default">Logout</a><br/>
<table>
<tr>
<td>DriverId</td>
<td>Source</td>
<td>Destination</td>
</tr>

<c:forEach var="trip" items="${trips}">
<tr>
<td><a href="searchdriverprofile?driverid=${trip.driverid}">${trip.driverid}</a></td>
<td>${trip.source}</td>
<td>${trip.destination}</td>
</tr>
</c:forEach>

</table>

</body>
</html>
