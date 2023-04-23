<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css"
	href="webjars/bootstrap/3.3.7/css/bootstrap.min.css" />

<c:url value="/css/main.css" var="jstlCss" />
<link href="${jstlCss}" rel="stylesheet" />
</head>
<body>
		<div style="color: blue;font-size: 200%;">
			Employee Management System
		</div>
	<br>
	<div>
		<div>
			<table border="5%">
				<thead>
					<tr>
						<th>Id</th>
						<th>Name</th>
						<th>Salary</th>
						<th>Age</th>
						<th>Department</th>
						<th>Department Type</th>
					</tr>
				</thead>

				<tbody>
			
					<c:forEach items="${empList}"
						var="emp" varStatus="status">
						<tr>
							<td>${emp.empId}</td>
							<td>${emp.empName}</td>
							<td>${emp.empSalary}</td>
							<td>${emp.empAge}</td>
							<td>${emp.department.depName}</td>
							<td>${emp.department.depType}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>

		</div>
		<br>
		<div class="container">

			<div class="starter-template">
			 <a href="/addEmployeePage">
               <button class="button button1">Add Employee</button>
             </a>
              <a href="/updatePage">
               <button class="button button2">Update Employee</button>
             </a>
              <a href="/deletePage">
               <button class="button button3">Delete Employee</button>
             </a>
			</div>

		</div>

		<script type="text/javascript"
			src="webjars/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>
</html>