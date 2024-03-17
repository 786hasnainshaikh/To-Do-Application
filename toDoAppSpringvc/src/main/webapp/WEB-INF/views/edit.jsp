<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@include file="/WEB-INF/components/all_css/css.jsp"%>
</head>
<body style="background-color: #b2bdbf">
	<%@include file="/WEB-INF/components/navbar/navBar.jsp"%>

	<div class="container mt-5">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<div class="card">
					<div class="card-header">
						<h3 class="text-center">Edit To Do</h3>
						
						

					</div>

					<div class="card-body">

						<form action="updatetodo" method="post">
						
						<input type="hidden" name="id" value="${todo.id}">
						
							<div class="form-group">
								<label for="exampleInputEmail1">ToDo Title</label> <input
									type="text" class="form-control" id="exampleInputEmail1"
									aria-describedby="emailHelp" placeholder="Todo Title"
									name="todpTitle" value="${todo.todpTitle }">

							</div>

							<div class="form-group">
								<label for="exampleInputEmail1">ToDo Content</label> <input
									type="text" class="form-control" id="exampleInputEmail1"
									aria-describedby="emailHelp" placeholder="Todo Content"
									name="todoContent" value="${todo.todoContent}">

							</div>


							<div class="form-group">
								<label for="exampleInputEmail1">Date</label> <input type="text"
									class="form-control" id="exampleInputEmail1"
									aria-describedby="emailHelp" placeholder="dd/mm/yyyy"
									name="date" value="${todo.date }">

							</div>


							<div class="text-center mt-3">
								<button type="submit" class="btn btn-primary">Edit</button>
							</div>
						</form>


					</div>

				</div>
			</div>
		</div>
	</div>
</body>
</html>