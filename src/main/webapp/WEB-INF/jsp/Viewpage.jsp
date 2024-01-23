<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<title>View Resumes</title>
<style>
/* Set font family and size */
body {
	background-color: #f0f6ff;
	font-family: Arial, sans-serif;
	font-size: 14px;
}

/* Center the table */
table {
  width: 100%;
  border-collapse: collapse;
  margin-bottom: 20px;
}

/* Style the table headers */
th {
  background-color: #f2f2f2;
  font-weight: bold;
  padding: 10px;
  border: 1px solid #ddd;
  text-align: left;
}

/* Style the table cells */
td {
  padding: 10px;
  border: 1px solid #ddd;
}

/* Style alternate rows */
tr:nth-child(even) {
	background-color: #f2f2f2;
}

/* Style hover effect on rows */
tr:hover {
	background-color: #ddd;
}

/* Style form inputs */
input[type=text], select {
	width: 50%;
	padding: 10px 10px;
	margin: 5px 0;
	box-sizing: border-box;
	border: 2px solid #ccc;
	border-radius: 4px;
}

input[type=submit] {
	background-color: #4CAF50;
	color: white;
	padding: 12px 20px;
	border: none;
	border-radius: 4px;
	cursor: pointer;
}

input[type=submit]:hover {
	background-color: #45a049;
}

/* Style form labels */
label {
	display: inline-block;
	width: 100px;
	text-align: left;
	font-weight: bold;
}

/* Style form container */
.form-container {
	margin-top: 50px;
	width: 50%;
	margin: 0 auto;
	padding: 20px;
	border: 1px solid #ccc;
	border-radius: 10px;
}

.toolbar {
	background-color: #333;
	/* Change this to the background color you want for the toolbar */
	color: #fff;
	/* Change this to the font color you want for the toolbar */
	padding: 5px;
	display: flex;
	justify-content: space-between;
	align-items: center;
}

.toolbar button {
	background-color: #007bff;
	/* Change this to the background color you want for the button */
	color: #fff;
	/* Change this to the font color you want for the button */
	border: none;
	padding: 10px 20px;
	border-radius: 5px;
	cursor: pointer;
}

.toolbar button:hover {
	background-color: #0069d9;
	/* Change this to the background color you want for the button on hover */
}
</style>
<script type="text/javascript">
    var elems = document.getElementsByClassName('confirmation');
    var confirmIt = function (e) {
        if (!confirm('Are you sure?')) e.preventDefault();
    };
    for (var i = 0, l = elems.length; i < l; i++) {
        elems[i].addEventListener('click', confirmIt, false);
    }
</script>
</head>
<body>
	<div class="toolbar">
		<h1>Welcome To Online Resume System</h1>
		<h2>${del}</h2>
		<a href="back"><button type="submit">Back</button></a>
		<a href="loglout"><button type="submit">Logout</button></a>
	</div>
	<h2>Resumes Details</h2>
	
		<table>
			<tr>
				<th>Serial number</th>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Email</th>
				<th>Contact Number</th>
				<th>Date of Birth</th>
				<th>Gender</th>
				<th>Total Experience</th>
				<th>City Applying</th>
				<th>10th Percentage</th>
				<th>12th Percentage</th>
				<th>Highest Qualification</th>
				<th>Year of Highest Qualification</th>
				<th>Current Company</th>
				<th>Current Designation</th>
				<th>Current CTC</th>
				<th>Action</th>
			</tr>

			<tr>
				<td>${model.slno}</td>
				<td>${model.firstname}</td>
				<td>${model.lastname}</td>
				<td>${model.email}</td>
				<td>${model.contactnumber}</td>
				<td>${model.dateofbirth}</td>
				<td>${model.gender}</td>
				<td>${model.totalexperience}</td>
				<td>${model.cityapplying}</td>
				<td>${model.tenthpercentage}</td>
				<td>${model.twelvethpercentage}</td>
				<td>${model.highestqualification}</td>
				<td>${model.yearofhighestqualification}</td>
				<td>${model.currentCompany}</td>
				<td>${model.currentDesignation}</td>
				<td>${model.currentCTC}</td>
				
				<c:if test="${ not empty model.slno}">
				<td><a href="/delete?no=${model.slno}" id="delete" class="confirmation" onclick="return confirm('Are you sure?')">Delete</a>
					<a href="update?no=${model.slno}">Update</a></td> 
				</c:if>
				
				
			</tr>
		</table>
	<h1>Jobs Details</h1>

	<form action="search">
		<div>
			<label for="search">Search Job Title:</label> <input type="text"
				id="search" name="jobtitle" required>
			<button type="submit">Search</button>
		</div>
		</form>
		<table>
			<tr>
				<th>Job title</th>
				<th>Job description</th>
				<th>Job location</th>
				<th>Job type</th>
			</tr>
			<c:forEach items="${jobs}" var="job">
				<tr>
					<td>${job.jobtitle}</td>
					<td>${job.jobdescription}</td>
					<td>${job.joblocation}</td>
					<td>${job.jobtype}</td>
				</tr>
			</c:forEach>
		</table>
</body>
</html>
