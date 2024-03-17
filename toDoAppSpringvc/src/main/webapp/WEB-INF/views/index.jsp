<!doctype html>
<%@page import="com.entities.todo"%>
<%@page import="java.util.*" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false" %>

<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@include file="/WEB-INF/components/all_css/css.jsp"%>

<title>Home Page</title>
</head>
<body  style="background-color: #e4f5f3">
	<%@include file="/WEB-INF/components/navbar/navBar.jsp"%>


	<div class="container mt-5">
		<div class="row">
			<div class="col-md-8 offset-md-2">

				<table class="table">
					<thead class="table-warning">
						<tr>
							<th scope="col">SR</th>
							<th scope="col">Todo Title</th>
							<th scope="col">Todo Content</th>
							<th scope="col">Date</th>
							<th scope="col">Action</th>
						</tr>
					</thead>
					<tbody>
						
						 
						<c:forEach var="items" items="${list }">
						   
						   <tr>
						   
						   <th scope="row">${items.id }</th>
							<td>${items.todpTitle }</td>
							<td>${items.todoContent }</td>
							<td>${items.date }</td>
							<td>
							
							<a href="edit/${items.id }" class="btn btn-info" > Edit</a>
							<a href="delete/${items.id }" class="btn btn-info"> Delete</a>
							
							
							</td>
						  
						  </tr>
						  
						</c:forEach>
							
						

					</tbody>
				</table>

			</div>
		</div>

	</div>



</body>
</html>
