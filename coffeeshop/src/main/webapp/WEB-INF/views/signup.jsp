<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SignUp</title>
</head>
<body> 
	<h1>SignUp</h1>
	<p>Please fill out form to create an account</p>
	<hr>
	<form action="/signup" method="POST">
            <label for="firstName"><b>First Name</b></label>
            <input type="text" placeholder="Enter First Name" name="first name" required>
            <label for="email"><b>Email</b></label>
            <input type="text" placeholder="Enter Email" name="email" required>
            <label for="password"><b>Password</b></label>
            <input type="password" placeholder="Enter Password" name="password" required>
            <p>
          <input type="submit" value="Sign-up" class="signup" />
		<!--  <input type="submit" value="Submit"> -->
		<!-- <button>Submit</button> -->
	</p>	
     </form>
</body>
</html>