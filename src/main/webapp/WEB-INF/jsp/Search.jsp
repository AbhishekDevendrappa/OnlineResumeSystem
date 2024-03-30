<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search</title>
<style>
/* Set font family and size */
body {
	background-color: #f0f6ff;
	font-family: Arial, sans-serif;
	font-size: 14px;
}

/* Center the table */
table {
	margin: 0 auto;
}

/* Style table headers */
th {
	font-weight: bold;
	background-color: #ddd;
	border: 1px solid #ccc;
	padding: 8px;
}

/* Style table cells */
td {
	border: 1px solid #ccc;
	padding: 8px;
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
	width: 100%;
	padding: 12px 20px;
	margin: 8px 0;
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
</head>
<body>
<div class="toolbar">
		<h1>Jobs.Com</h1>
		<h2>${um}</h2>
		<a href="back1"><button type="submit">Back</button></a>
		<a href="loglout"><button type="submit">Logout</button></a>
	</div>
<table>
			<tr>
				<th>Job title</th>
				<th>Job description</th>
				<th>Job location</th>
				<th>Job type</th>
				<th>Apply job</th>
			</tr>
			<c:forEach items="${jobs}" var="job">
				<tr>
					<td>${job.jobtitle}</td>
					<td>${job.jobdescription}</td>
					<td>${job.joblocation}</td>
					<td>${job.jobtype}</td>
					<td><button type="submit">Apply</button></td>
				</tr>
			</c:forEach>
		</table>
</body>
</html>