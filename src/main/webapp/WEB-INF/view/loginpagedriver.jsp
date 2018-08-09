<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>

<head>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular.min.js"></script>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>DriverLogin</title>
<link rel="icon" type="image/png" href="images/icons/favicon.ico"/>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="/fonts/font-awesome-4.7.0/css/font-awesome.min.css">
	<link rel="stylesheet" type="text/css" href="/fonts/iconic/css/material-design-iconic-font.min.css">
	<link rel="stylesheet" type="text/css" href="/vendor/animate/animate.css">
	<link rel="stylesheet" type="text/css" href="/vendor/css-hamburgers/hamburgers.min.css">
	<link rel="stylesheet" type="text/css" href="/vendor/animsition/css/animsition.min.css">
	<link rel="stylesheet" type="text/css" href="/vendor/select2/select2.min.css">
	<link rel="stylesheet" type="text/css" href="/vendor/daterangepicker/daterangepicker.css">
	<link rel="stylesheet" type="text/css" href="/css/login.css">
</head>
<body>
<div class="limiter">
		<div class="container-login100" style="background-image: url('/img/bg-01.jpg');">
			<div class="wrap-login100">
<div ng-app="">
<form method="post" action="/verify-driver" class="login100-form validate-form">
<!-- <a href="/show">Show users</a>&nbsp; -->
<!-- <a href="/login">Login</a><br/> -->
<!-- <a href="/loginDriver">Login for Drivers</a><br/> -->

<c:if test="${not empty error}">
<!-- <div class="alert alert-danger">-->
<font color="red">
<c:out value="${error}"></c:out>
</font>
</c:if>
<span class="login100-form-logo">
						<i class="zmdi zmdi-landscape"></i>
					</span>

					<span class="login100-form-title">
						Log in
					</span>

					<div class="wrap-input100 validate-input" data-validate = "Enter username">
						<input class="input100" type="text" name="email" placeholder="Email" required="required" value="${driver.email}">
						<span class="focus-input100" data-placeholder="&#xf207;"></span>
					</div>

					<div class="wrap-input100 validate-input" data-validate="Enter password" >
						<input class="input100" type="password" name="password" placeholder="Password" required="required" value="${driver.password}">
						<span class="focus-input100" data-placeholder="&#xf191;"></span>
					</div>

					<div class="container-login100-form-btn">
						<input type="submit" value="Login" style="background-color:white; border-radius:20px;padding: 16px;"/>
							
						
					</div>
				</form>
			</div>
		</div>
	</div>
	<script src="/vendor/jquery/jquery-3.2.1.min.js"></script>
	<script src="/js/login.js"></script>
<!-- <br/>Username:<input type="text" name="email" value="${user.email}"/><br/>
Password:<input type="password" name="password" value="${user.password}"/><br/>
<input type="submit" value="Login"/>

</form> -->
</div>
</body>


</html>
