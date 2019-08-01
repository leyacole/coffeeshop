<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Users</title>
</head>
<body>

	<div class="container">
		<h1>Customers of Coffeeshop</h1>
		<table class="table">
			<thead>
				<tr>
					<th>Users</th><th>Name</th><th>Username</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="user" items="${users}">
				<tr>
					<td><a href="/users/detail?username=${users.username}">${user.name}</a></td>
					<td>${users.name}</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
		<a href="/rooms/add" class="btn btn-secondary">Add Room</a>
	</div>

</body>
</html>