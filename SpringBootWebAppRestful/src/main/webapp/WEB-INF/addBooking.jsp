<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>

	<head>
		<style type="text/css">
		.filterDiv {
		  display: none;
		}
		
		.show {
		  display: block;
		}
		
		.imgcar
		      {
		  width:100%;
		  height:100%;
		}
		</style>
		
	<!-------------- Connect Database -------------->
	<%
			String driver = "com.mysql.jdbc.Driver";
		  
		    String userName = "root";
		    String password = "";
	%>
	<!-------------- ---------------- -------------->
	
	<script type='text/javascript'>
	    alert("Choose Car Type");
	</script>
	
	
	
	
	<!------------------- Script ------------------->
	<%@include file="_head.jsp"%>
	<!------------------- ------ ------------------->
	<title> CH - Car List </title>
	</head>

	<body>
	<!----------------- Navigation ----------------->
	<%@include file="_navbarcustomer2.jsp" %>
	<!----------------- ---------- ----------------->
	
	<!------------------- Coding ------------------->
	    <main role="main">
	
	      <section class="jumbotron text-center">
	        <div class="container">
	          <h1 class="jumbotron-heading">Available Car</h1>
	        
	        </div>
	      </section>
	
	<hr>
	<!---------------------->
	
	      <div class="album py-5 bg-light">
	        <div class="container">
	          <div class="row">
	          
	         
	     		<c:forEach var="car" items="${cars}">
	                <div class='col-md-4'>
	                    <div class='card mb-4 shadow-sm'>
	                        <img class='imgcar' src='images/CARperoduaalza.png'>
	                        <div class='card-body'>
	                            <h3 class='card-text'>${car.brand } ${car.name }</h3><hr>
	
	                            <p class='card-text'><i class='fas fa-chair'></i> ${car.description } Seat</p>
	
	                            <p class='card-text'><i class='fas fa-car-side'></i>${car.price } </p>
	
	                            <p class='card-text'><i class='fas fa-money-bill'></i> RM ${car.rate }>/Hour</p>
	
	                            <div class='d-flex justify-content-between align-items-center'>
	                                <div class='btn-group'>
	                                    <a class='btn btn-warning' href='/homecustomer'><b>RENT NOW!</b></a>
	                                </div>
	                            </div>
	                            
	                        </div>
	                    </div>
	                </div>
	              </c:forEach>
		  
	              
	          </div>
	        </div>
	      </div>
	
	    </main>
	
	  </body>
</html>
