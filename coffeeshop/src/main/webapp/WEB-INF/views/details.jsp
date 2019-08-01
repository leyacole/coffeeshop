<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customers of Coffeeshop</title>
</head>
<body>

	<div class="container">
		<h1>Customers of Coffeeshop</h1>
		<table class="table">
			<tr>
				<th scope="row">Username</th>
				<td>${users.username}</td>
			</tr>
			<tr>
				<th scope="row">Name</th>
				<td>${users.name}</td>
			</tr>
			
		</table>
		
		<a class="btn link" href="/users">Back to List</a>
	</div>

</body>
</html>