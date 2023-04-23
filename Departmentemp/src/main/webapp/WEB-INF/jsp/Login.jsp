<!DOCTYPE html>   
<html>   
<head>  
<title> Login Page </title>  
<link rel="stylesheet" type="text/css" href="login.css" />
<link href="https://fonts.googleapis.com/css?family=Rock+Salt"
	rel="stylesheet" type="text/css" />
</head>    
<body>   
   <h1 class="heading"> <span class="sp">Yash Login Form</span>  </h1> 
    
    <form action="/login" name="login">  
  <div class="container">     
            <label>Email : </label>   
            <input type="text" placeholder="Enter Email" name="email" required>  <br><br>
            <label>Password : </label>   
            <input type="password" placeholder="Enter Password" name="password" required>  <br><br>
            <button type="submit" class="btn">Login</button>   
        </div>   
    </form>   <br>  
      <div>
    <p>Not have an account? <a href="/registration" class="sing">Sign Up</a>.</p>
  </div>
    
</body>     
</html>  