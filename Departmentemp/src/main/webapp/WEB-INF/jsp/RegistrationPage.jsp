<!DOCTYPE html>   
<html>   
<head>  
<title> Registration Page </title>  
<link rel="stylesheet" type="text/css" href="Registration.css" />
<link href="https://fonts.googleapis.com/css?family=Rock+Salt"
	rel="stylesheet" type="text/css" />
</head>    
<body>    
    <center> <h1 class="heading"> Yash Registration Form </h1> </center>   
    
    <form action="saveregistration" method="post" name="registration">  
        <div class="container">   
         <label>Name: </label>   
            <input type="text" placeholder="Enter Full Name" name="name" required>  <br><br>
            <label>Email : </label>   
            <input type="text" placeholder="Enter Email" name="email" required>  <br><br>
            <label>Mobile : </label>   
            <input type="text" placeholder="Enter Mobile Number" name="mobile" required>  <br><br>
            <label>Password : </label>   
            <input type="password" placeholder="Enter Password" name="password" required>  <br><br>
            <button type="submit" class="btn">Registration</button>   
        </div>   
    </form>   <br>  
   <div>
    <p>Already have an account? <a href="/" class="sing">Sign in</a>.</p>
  </div>
    
</body>     
</html>  