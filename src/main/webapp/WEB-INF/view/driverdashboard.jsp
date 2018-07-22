<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>

<head>
	<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular.min.js"></script>
	<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="/js/driverdash.js"></script>
	<link href="/css/driverdash.css" rel="stylesheet" type="text/css">
	<link href="/css/footer.css" rel="stylesheet" type="text/css">
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Dashboard</title>
</head>
<body>
	<header>
		<div class="row">
			<div class="col-sm-8 upper">
				<div class="upperleft1">Grab</div>
				<div class="upperleft2">Cab</div>
				<div>
					<img src="/img/12.jpg" style="margin-left:2%;width:67%;float: left;"><hr style="float:left;color:black;"/>
				</div>
			</div>
		</div>
	</header>
<h1>hello${drivers.firstname}</h1>
	<div class="row main">
		<form method="post" action="insert-trip">
		<input type="hidden" name="id" value="${trip.id}"/>
		<input type="hidden" name="driverid" value="${drivers.id}"/>
			<div class="col-sm-6 left">
				<div class="inner">
				<input type="text" name="source" style="margin-top: 16%;" placeholder="Enter source..." value="${trip.source}"><br/><br/>
				<input type="text" name="destination" placeholder="Enter Destination..." value="${trip.destination}"><br/><br/>
				<input type="submit" class="btn-danger btn" value="Add Trip" />
				</div>
			</div>
		</form>
		<div class="col-sm-6">
			<div class="row right">
				<div class="inner2">
					<div class="history">HISTORY</div><br/><br/>
					<div class="trips">
						<table>
						  <tr>
						    <th>Source</th>
						    <th>Destination</th> 
						  </tr>
			
						 <c:forEach var="trips12" items="${trips1}">
							<tr>
							
								<td>${trips12.source}</td>
								<td>${trips12.destination}</td>
								

							</tr>
						</c:forEach>
						    
						</table>
					</div>
				</div>
			</div>
		</div>
	</div>
	<footer class="footer-distributed">

			<div class="footer-left">

				<h3>Grab<span>Cab</span></h3>

				<p class="footer-links">
					<a href="#">Home</a>
					·
					<a href="#">Cab Booking</a>
					·
					<a href="#">About</a>
					·
					<a href="#">Faq</a>
					·
					<a href="#">Contact</a>
				</p>

				<p class="footer-company-name">Company Name &copy; 2018</p>
			</div>

			<div class="footer-center">

				<div>
					<i class="fa fa-map-marker"></i>
					<p><span>21 ABC Street</span> Anand, Gujarat</p>
				</div>

				<div>
					<i class="fa fa-phone"></i>
					<p>+91 1234567890</p>
				</div>

				<div>
					<i class="fa fa-envelope"></i>
					<p><a href="mailto:support@company.com">support@company.com</a></p>
				</div>

			</div>

			<div class="footer-right">

				<p class="footer-company-about">
					<span>About the company</span>
					Providing easy and fast cabs.
				</p>

				<div class="footer-icons">

					<a href="#"><i class="fa fa-facebook"></i></a>
					<a href="#"><i class="fa fa-twitter"></i></a>
					<a href="#"><i class="fa fa-linkedin"></i></a>
					<a href="#"><i class="fa fa-github"></i></a>

				</div>

			</div>

		</footer>
</body>
</html>