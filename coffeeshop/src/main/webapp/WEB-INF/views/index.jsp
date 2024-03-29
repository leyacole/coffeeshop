<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
</head>
<body>
    
	<div class="container">
		<h1>Welcome to GC Coffee</h1>
		<table class="table">
			<tr>
				<th>Product</th>
				<th>Description</th>
				<th>Price</th>
			</tr>
			
			<c:forEach var="i" items="${list }">
			 <tr>
			 	<td>${i.name }</td>
			 	<td>${i.description }</td>
			 	<td>${i.price }</td>
			 </tr>
			</c:forEach>
		</table>
		<a href="/signup" class="btn btn-secondary">Register</a>
		<!--  <button onclick="index/register" class="btn btn-primary">Register Here</button> -->
     </div>		
     
     <div>
     <a href="/admin">Admin</a>
     </div>

</body>
</html>