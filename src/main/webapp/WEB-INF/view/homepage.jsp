<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
	<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular.min.js"></script>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<link href="plugins/font-awesome-4.7.0/css/font-awesome.min.css" rel="stylesheet" type="text/css">
	<link rel="stylesheet" type="text/css" href="styles/bootstrap4/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="/plugins/OwlCarousel2-2.2.1/owl.carousel.css">
<link rel="stylesheet" type="text/css" href="/plugins/OwlCarousel2-2.2.1/owl.theme.default.css">
<link rel="stylesheet" type="text/css" href="/plugins/OwlCarousel2-2.2.1/animate.css">
<link rel="stylesheet" type="text/css" href="/css/mainstyles.css">
<link href="/css/footer.css" rel="stylesheet" type="text/css">
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>GrabCab</title>
</head>

<body>

<div class="super_container">

	<!-- Header -->

	<header class="header">
			
		<!-- Top Bar -->
		<div class="top_bar">
			<div class="top_bar_container">
				<div class="container">
					<div class="row">
						<div class="col">
							<div class="top_bar_content d-flex flex-row align-items-center justify-content-start">
								<ul class="top_bar_contact_list">
									<li><div class="question">Have any questions?</div></li>
									<li>
										<i class="fa fa-phone" aria-hidden="true"></i>
										<div>+91-8888888888</div>
									</li>
									<li>
										<i class="fa fa-envelope-o" aria-hidden="true"></i>
										<div>info.grabcab@gmail.com</div>
									</li>
								</ul>
								<div class="top_bar_login ml-auto">
									<div class="login_button"><a href="welcome">Register or Login</a></div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>				
		</div>

		<!-- Header Content -->
		<div class="header_container">
			<div class="container">
				<div class="row">
					<div class="col">
						<div class="header_content d-flex flex-row align-items-center justify-content-start">
							<div class="logo_container">
								<a href="#">
									<div class="logo_text">Grab<span>Cab</span></div>
								</a>
							</div>
							<nav class="main_nav_contaner ml-auto">
								<ul class="main_nav">
									<li class="active"><a href="#">Home</a></li>
									<li><a href="about.html">About</a></li>
									<li><a href="courses.html">AAA</a></li>
									<li><a href="blog.html">BBB</a></li>
									<li><a href="#">CCC</a></li>
									<li><a href="contact.html">DDD</a></li>
								</ul>
							</nav>

						</div>
					</div>
				</div>
			</div>
		</div>			
	</header>
	<!-- Home -->

	<div class="home">
		<div class="home_slider_container">
			
			<!-- Home Slider -->
			<div class="owl-carousel owl-theme home_slider" style="z-index: 0;">
				
				<!-- Home Slider Item -->
				<div class="owl-item">
					<div class="home_slider_background" style="background-image:url(/img/13.jpg)"></div>
					
				</div>

				<!-- Home Slider Item -->
				<div class="owl-item">
					<div class="home_slider_background" style="background-image:url(/img/13.jpg)"></div>
				</div>

				<!-- Home Slider Item -->
				<div class="owl-item">
					<div class="home_slider_background" style="background-image:url(/img/13.jpg)"></div>
				</div>

			</div>
		</div>

		<div class="home_slider_content" style="position: absolute;">
						<div class="container">
							<div class="row">
								<div class="col text-center">
									<div class="home_slider_title">The Premium Cab Service</div>
									<div class="home_slider_subtitle">Future Of Cab</div>
									<div class="home_slider_form_container">
										<form action="#" id="home_search_form_1" class="home_search_form d-flex flex-lg-row flex-column align-items-center justify-content-between">
											<div class="d-flex flex-row align-items-center justify-content-start">
												<select class="dropdown_item_select home_search_input">
													
													<option>Anand</option>
													<option>Ahmedabad</option>
													<option>Godhra</option>
													<option>Vadodara</option>
													<option>Rajkot</option>
													<option>Nadiad</option>
												</select>
												<select class="dropdown_item_select home_search_input">
													
													<option>Anand</option>
													<option>Ahmedabad</option>
													<option>Godhra</option>
													<option>Vadodara</option>
													<option>Rajkot</option>
													<option>Nadiad</option>
												</select>
											</div>
											<button type="submit" class="home_search_button">search</button>
										</form>
									</div>
								</div>
							</div>
						</div>
					</div>

		<!-- Home Slider Nav -->

		<div class="home_slider_nav home_slider_prev"><i class="fa fa-angle-left" aria-hidden="true"></i></div>
		<div class="home_slider_nav home_slider_next"><i class="fa fa-angle-right" aria-hidden="true"></i></div>
	</div>
		<footer class="footer-distributed">

			<div class="footer-left">

				<h3>Grab<span>Cab</span></h3>

				<p class="footer-links">
					<a href="#">Home</a>
					�
					<a href="#">Cab Booking</a>
					�
					<a href="#">About</a>
					�
					<a href="#">Faq</a>
					�
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


<script src="/js/jquery-3.2.1.min.js"></script>
<script src="/styles/bootstrap4/popper.js"></script>
<script src="/styles/bootstrap4/bootstrap.min.js"></script>
<script src="/plugins/greensock/TweenMax.min.js"></script>
<script src="/plugins/greensock/TimelineMax.min.js"></script>
<script src="/plugins/scrollmagic/ScrollMagic.min.js"></script>
<script src="/plugins/greensock/animation.gsap.min.js"></script>
<script src="/plugins/greensock/ScrollToPlugin.min.js"></script>
<script src="/plugins/OwlCarousel2-2.2.1/owl.carousel.js"></script>
<script src="/plugins/easing/easing.js"></script>
<script src="/plugins/parallax-js-master/parallax.min.js"></script>
<script src="/js/home.js"></script>
    </div>
</body>
</html>