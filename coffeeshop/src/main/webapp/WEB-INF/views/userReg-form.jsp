<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Form</title>
</head>
<body>

<div class="container">
		<h1>Register</h1>
	<form>
		<label for="Name">Name:</label>
		<input name="name" id="Name" type="text" required placeholder="John">

		
		<div>
			<label for="username">Username: </label>
			<input type="username" id="username" placeholder="your username" required>

				
			<label for="password">Password:</label>
			<input type="password" id="password" placeholder="password" required>
		</div>

		<div>
			<label for="termsagreed">I agree to the terms and conditions</label>
			<input id="termsagreed" name="termsagreed" type="checkbox" required>
		</div>
		
	<p>
		<input type="submit" value="Submit">
		<!-- <button>Submit</button> -->
	</p>	
	</form>
</div>

		

</body>
</html>