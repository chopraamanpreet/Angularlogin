<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
	<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular.min.js"></script>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="/js/custom.js"></script>
	<link href="/css/custom.css" rel="stylesheet" type="text/css">
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Dashboard</title>
</head>
<body>
 <div ng-app="">
	<div class="row">
		<div class="column left"><img class="insideimg" src="/img/image.jpg"></div>
		<div class="column right">
			<div class="row">
    			<div class="container-fluid">       
					<div class="upper">
						<p id="name">REGISTER</p>
						<a href="/show">Show users</a>
					<a href="/login">Login</a><br/>
					</div>
					
    			</div>
			</div>


			<form method="post" action="insert">

				<input type="hidden" name="id" value="${user.id}"/><br/>
				<div class="row">
    				<div class="container-fluid">
						<div style="margin-left:25.8%;">
							<div class="col-3 input-effect">
								<input class="effect-16" placeholder="" type="text" name="username" value="${user.username}"/>
								<label>User Name</label>
								<span class="focus-border"></span>
							</div>
						</div>
					</div>
				</div>
				<div class="row">
    				<div class="container-fluid">
						<div style="margin-left:25.8%;">
							<div class="col-3 input-effect">
				<input class="effect-16" placeholder="" type="password" name="password" value="${user.password}"/>
				<label>Password</label>
				<span class="focus-border"></span>
			</div>
		</div>
	</div>
</div>
<!-- Username:<input type="text" name="username" value="${user.username}"/><br/>
Password:<input type="password" name="password" value="${user.password}"/><br/> -->
<input type="submit" value="Register"/>

</form>
</div>
</div>
</div>
</body>


</html>
