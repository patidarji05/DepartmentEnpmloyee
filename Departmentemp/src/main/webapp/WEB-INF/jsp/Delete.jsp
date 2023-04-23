<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" type="text/css" href="deleteemployee.css" />
<link href="https://fonts.googleapis.com/css?family=Rock+Salt"
	rel="stylesheet" type="text/css" />
</head>
<body>
<div class="container"> 
  <div>
  <fieldset>
    <legend>Search Employee By Id</legend>
    <form action="GetEmployee" method="get">
     <p class="p1">
      EmployeeID: <input type="text" name="empId" placeholder="Search... Employee Id" />
       <button type="submit"><i class="fa fa-search"></i></button>
       </p>
    </form>
    
   <br>
   <br>
  
    <fieldset>
    <legend>Enter New Employee Details</legend>
     <form  action="deleteEmployee" name="employee">
     <p class="p">
    EmployeeId: <input type="text" id="empId" name="empId" placeholder="" value="${emp.get().empId }"  readonly/> 
     </p>
     <p class="p">
     EmployeeName: <input type="text" name="empName" placeholder="Enter employee Name" value="${emp.get().empName }" readonly/>
     </p>
          <p class="p">
     EmployeeSalary: <input type="text" name="empSalary" placeholder="Enter employee Salary" value="${emp.get().empSalary }" readonly/>
     </p>
         <p class="p">
     EmployeeAge: <input type="text" name="age" placeholder="Enter employee age" value="${emp.get().age }" readonly/>
     </p>
     
     <p class="p">
     DepartmentId: <input type="text" name="department.deptId"  value="${emp.get().department.deptId }" readonly="readonly"/>
     </p>
     
        <p class="p">
     DepartmentName: <input type="text" name="department.deptName" placeholder="Enter Department Name" value="${emp.get().department.deptName }" readonly/>
     </p>
    <p class="p">
     DepartmentType: <input type="text" name="department.deptType" placeholder="Enter Department Type" value="${emp.get().department.deptType }" readonly/>
     </p>
     <p class="p">
     <input type="submit" name="submit"  value="Delete Employee"/>
      <a href="/home"> <input type="button" name="button" value="Go To Home Page"></a>
     </p>
     
     </form>
  </fieldset>
   </fieldset>
  </div>
  </div>
</body>
</html>