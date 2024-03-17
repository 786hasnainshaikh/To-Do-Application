<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@include file="/WEB-INF/components/all_css/css.jsp"%>
</head>
<body>

	<nav class="navbar navbar-expand-lg navbar-light bg-info">
		<a class="navbar-brand" href="#">Todo Application</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse font-weight-bold"
			id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">

				<li class="nav-item"><a class="nav-link"
					href="${pageContext.request.contextPath}/">Home</a></li>
				<li class="nav-item"><a class="nav-link" href="addtodo">Add
						toDo</a></li>
				<li class="nav-item"><a class="nav-link"
					href="${pageContext.request.contextPath}/">View toDo</a></li>

			</ul>

		</div>


	</nav>

</body>
</html>