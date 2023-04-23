<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" type="text/css" href="addemployee.css" />
<link href="https://fonts.googleapis.com/css?family=Rock+Salt"
	rel="stylesheet" type="text/css" />
</head>
<body>
   <div class="container"> 
    <fieldset>
    <legend>Enter Employee Details</legend>
     <form  action="save"  method="post" name="employee">
    <p class="p">
   <!--   EmployeeId: <input type="text" id="empId" name="empId" placeholder="" value=""  readonly/> -->
     </p>
     <p class="p">
     EmployeeName: <input type="text" name="empName" placeholder="Enter employee Name" value="" required="required"/>
     </p>
        <p class="p">
     EmployeeSalary: <input type="text" name="empSalary" placeholder="Enter employee Salary" value="" required="required"/>
     </p>
       <p class="p">
     EmployeeAge: <input type="text" name="age" placeholder="Enter employee age" value="" required="required"/>
     </p>
        <p class="p">
     DepartmentName: <input type="text" name="department.deptName" placeholder="Enter Department Name" value="" required="required"/>
     </p>
   <p class="p">
     DepartmentType: <input type="text" name="department.deptType" placeholder="Enter Department Type" value="" required="required"/>
     </p>
    <p class="p"> 
     <input type="submit" name="submit"  value="Submit"/>
     <input type="reset" name="reset" value="Clear">
      <a href="/home"> <input type="button" name="button" value="Go To Home Page"></a>
     </p>
     
     </form>
  </fieldset>
  </div>
  
  
  
  <script type="text/javascript">
  var id=  document.getElementById("empId");  
  if(id.value==="")
	  {
	  id.value=1;
	  }
    console.log("....."+id.value);
  </script>
</body>
</html>