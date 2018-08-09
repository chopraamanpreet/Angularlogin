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
	<script>
function validateForm() {
    var x = document.forms["myForm"]["email"].value;
    var atpos = x.indexOf("@");
    var dotpos = x.lastIndexOf(".");
    if (atpos<1 || dotpos<atpos+2 || dotpos+2>=x.length) {
        alert("Not a valid e-mail address");
        return false;
    }
}
</script>
</head>
<body>
	<header>
		<div class="row">
			<div class="col-sm-8 upper">
				<div class="upperleft1" style="color: #14bdee;">Grab</div>
				<div class="upperleft2" style="color: #384158;">Cab</div>
				<div>
					<img src="/img/12.jpg" style="margin-left:2%;width:74%;float: left;"><hr style="float:left;color:black;"/>
				</div>
			</div>
			<div class="col-sm-4 upper">
				<div class="upperright">REGISTER(Driver)
				<a href="welcome" class="btn btn-info" style="margin-top:1px;margin-right: -3px;">Register as User</a>
<a href="/login" class="btn btn-primary" style="margin-top:-100px;">Already Registered Login Here</a>
				<a href="/loginDriver" class="btn btn-primary" style="margin-top:-100px;margin-right: 300px;">Login for Driver</a>
				</div>
				<!-- <a href="/login">Already Registered Login Here</a><br/> -->
				
			</div>
		</div>
	</header>
	<div class="main">
		<div class="row">
			<div class="col-sm-8 leftcol">
				<img src="/img/13.jpg" style="height:100%;width:100%;">
			</div>
            <form name="myForm" method="post" action="insert-driver" onsubmit="return validateForm();">
                <input type="hidden" name="id" value="${driver.id}"/>
			<div class="col-sm-4 rightcol">
				<div class="col-3">
					<input class="effect-16" type="text" placeholder="First Name" name="firstname" value="${driver.firstname}" required=""/>
					<label></label>
					<span class="focus-border"></span>
				</div>
				<div class="col-3">
					<input class="effect-16" type="text" placeholder="Last Name" name="lastname" value="${driver.lastname}" required=""/>
					<label></label>
					<span class="focus-border"></span>
				</div>
				<div class="col-3">
					<input class="effect-16" type="email" placeholder="Email ID" name="email" value="${driver.email}" ng-model="email" required=""/>
					<label></label>
					<span class="focus-border"></span>
				</div>
				<div class="col-3">
					<input class="effect-16" type="tel" pattern="^\d{10}$" placeholder="Contact No" name="contact" value="${driver.contact}" required=""/>
					<label></label>
					<span class="focus-border"></span>
				</div>
				<div class="col-3">
					<input class="effect-16" type="text" placeholder="Gender" name="gender" value="${driver.gender}" required=""/>
					<label></label>
					<span class="focus-border"></span>
				</div>
				<div class="col-3">
					<input class="effect-16" type="text" placeholder="Address" name="address" value="${driver.address}" required=""/>
					<label></label>
					<span class="focus-border"></span>
				</div>
				<div class="col-3">
					<input class="effect-16" type="password" placeholder="Choose Your Password" name="password" value="${driver.password}" required=""/>
					<label></label>
					<span class="focus-border"></span>
				</div>
				<div class="btn">
					<!--<button type="button" class="btn btn-danger btn-lg">Register</button>-->
                    <input type="submit" class="btn btn-primary" value="Register"/>
				</div>
			</div>
            </form>
        </div>
    </div>
	
    </body>