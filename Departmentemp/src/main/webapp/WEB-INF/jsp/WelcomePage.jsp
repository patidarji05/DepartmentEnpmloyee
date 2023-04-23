
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="employee.css" />
<link href="https://fonts.googleapis.com/css?family=Rock+Salt"
	rel="stylesheet" type="text/css" />
</head>
<body>
	<div class="maindiv">
		<div class="headdiv">
			<h1 class="title">Yash Employee Management System</h1>
			
 <div class="container"> 
  <a href="/home">
     <button class="button4">Home</button>
    </a>
     <a href="/" class="a">
     <button class="button5">LogOut</button>
    </a>
 </div>

			<div class="tablediv">
				<table class="tble">
					<thead>
						<tr>
							<th>EmployeeID</th>
							<th>EmployeeName</th>
							<th>EmployeeSalary</th>
							<th>EmployeeAge</th>
							<th>DepartmentName</th>
							<th>DepartmentType</th>
						</tr>
					</thead>

					<tbody>
					  <c:forEach var="emp" items="${emp}">
						 <tr>
							<td>${emp.empId}</td>
							<td>${emp.empName}</td>
							<td>${emp.empSalary}</td>
							<td>${emp.age}</td>
							<td>${emp.department.deptName}</td>
							<td>${emp.department.deptType}</td>
							
						</tr>						
</c:forEach>
					</tbody>

				</table>
			</div>
		</div>
<br>
<br>
<div class="div1">
    <a href="/addEmployee">
     <button class="button1">ADD EMPLOYEE</button>
    </a>
    
   <a href="/updateEmployee">
     <button class="button2">UPDATE EMPLOYEE</button>
    </a>

   <a href="/deleteData">
     <button class="button3">DELETE EMPLOYEE</button>
    </a>
    
    </div>
    
	</div>
</body>
</html>