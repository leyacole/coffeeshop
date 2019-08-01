<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Administrator</title>
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
</head>
<body>
<div class="container">
		<h1>Administrator</h1>
		<table class="table">
			<tr>
				<th>Product</th>
				<th>Description</th>
				<th>Price</th>
			</tr>
			
			<c:forEach var="i" items="${list }">
			 <tr>
			 	<td><input type="text" value= "${i.name }"></input></td>
			 	<td><input type= "text" value= "${i.description }"></input></td>
			 	<td><input type= "text" value= "${i.price }"></input></td>
			 </tr>
			</c:forEach>
		</table>

<a class="btn btn-outline-info" href="/add">Add a new Product</a>
<br>
<a class="btn btn-outline-info" href="/" role="button">Home</a>
</div>
</body>
</html>