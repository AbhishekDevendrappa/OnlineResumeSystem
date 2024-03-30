<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	
	
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Main Page</title>
<style>
	form {
  margin: 0 auto;
  width: 50%;
  background-color: #f2f2f2;
  padding: 20px;
  border-radius: 10px;
}

label {
  font-weight: bold;
  display: block;
  margin-bottom: 10px;
}

input[type="text"],
input[type="email"],
input[type="tel"],
input[type="date"],
input[type="number"],
select {
  width: 100%;
  padding: 10px;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
  margin-bottom: 10px;
}

select {
  appearance: none;
  -webkit-appearance: none;
  -moz-appearance: none;
  background-position: right 10px center;
  background-repeat: no-repeat;
}

input[type="submit"] {
  background-color: #4CAF50;
  color: white;
  padding: 12px 20px;
  border: none;
  border-radius: 4px;
  cursor: pointer;
  float: right;
}

input[type="submit"]:hover {
  background-color: #45a049;
}

input[type="checkbox"] {
  margin-right: 5px;
}

a {
  color: #4CAF50;
  text-decoration: none;
}

a:hover {
  text-decoration: underline;
}
.toolbar {
  background-color: #333; /* Change this to the background color you want for the toolbar */
  color: #fff; /* Change this to the font color you want for the toolbar */
  padding: 5px;
  display: flex;
  justify-content: space-between;
  align-items: center;
}

.toolbar button {
  background-color: #007bff; /* Change this to the background color you want for the button */
  color: #fff; /* Change this to the font color you want for the button */
  border: none;
  padding: 10px 20px;
  border-radius: 5px;
  cursor: pointer;
}

.toolbar button:hover {
  background-color: #0069d9; /* Change this to the background color you want for the button on hover */
}
	

</style>


<c:if test="${msg}">
<h2>REsume Already Saved U can Update BY ViewING Page</h2>
</c:if>
</head>
<body bgcolor="#f0f6ff" align="center">

<div class="toolbar">
    <h1>Jobs.Com</h1>
     <h2>${um}</h2>
    <a href="loglout"><button type="submit">Logout</button></a>
    </div>
    <br>
    <br>
   
    <label>Fill Resume Details</label>
	<a href="fill1"><button type="submit">Fill Details</button></a>
	<br>
	<br>
	<label>View Resume and Job Details</label>
	<a href="view"><button type="submit">View Details</button></a>

</body>



</html>




