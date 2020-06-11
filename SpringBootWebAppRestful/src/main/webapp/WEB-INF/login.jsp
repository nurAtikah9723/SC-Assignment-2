<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html lang="en">
<head>
<!------------------- Script ------------------->
<%@include file="_head.jsp" %>
<!------------------- ------ ------------------->
<title>CH - Login</title>
</head>
<body>
<!----------------- Navigation ----------------->
<%@include file="_navbarcustomer.jsp" %>

<!----------------- ---------- ----------------->

<!------------------- Coding ------------------->
<form action="" class="form-signin" method="">
      <h1 class="h3 mb-3 font-weight-normal">Please sign in</h1><hr>
      <input type="text" name="username" class="form-control" placeholder="Username" required autofocus >
      <br>
      <input type="password" name="password" class="form-control" placeholder="Password" required><br>
     <!--  <button class="btn btn-lg btn-primary btn-block" type="submit"  name="submit">Sign in</button> -->
     
     <a href="/homecustomer" class="btn btn-lg btn-primary btn-block">Login</a>
     <br>
  <div class="col-12">
    <hr>
     <p class="lead"> Dont have an account? <a href="">Register</a> Here!</p>
    <hr>
  </div>
      

      <p class="mt-5 mb-3 text-muted">&copy; 2020 CarHub Company</p>
    </form>


</body>
</html>










