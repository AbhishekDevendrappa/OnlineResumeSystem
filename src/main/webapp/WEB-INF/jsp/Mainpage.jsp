<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
</head>
<body bgcolor="#f0f6ff" align="center">
	<div class="toolbar">
    <h1>Welcome To Online Resume System</h1>
    <h2>${um}</h2>
    <a href="loglout"><button type="submit">Logout</button></a>
    <a href="back3"><button type="submit">Back</button></a>
    </div>


	<form action="fill2" method="post">
		
		<h2>Personal Information</h2>
		<label>First Name:</label> 
		<input type="text" id="firstname" name="firstname" pattern="[A-Z a-z]+"  value="${r.firstname}" required> <br>
		<br> 
		
		<label>Last Name:</label>
		 <input type="text" id="lastname" name="lastname" pattern="[A-Z a-z]+" value="${r.lastname}" required> <br>
		<br> 
		 
		<label>Email:</label> <input type="email" id="email" name="email" pattern="[A-Za-z0-9]+@gmail.com" value="${r.email}" required> <br>
		<br> 
		
		<label>Contact Number:</label> 
		<input type="number" id="contactnumber" pattern="[0-9]{10}" name="contactnumber" value="${r.contactnumber}" required> <br>
		<br> 
		
		<label>Date of Birth:</label> 
		<input type="date" id="dateofbirth" name="dateofbirth" value="${r.dateofbirth}" required> <br>
		<br>
		
	    <label>Gender:</label> 
	    <select id="gender" name="gender" value="${r.gender}" required>
			 <option value="">Select Gender</option>
			<option value="male">Male</option>
			<option value="female">Female</option>
			<option value="other">Other</option>
		</select> <br>
		<br>
		
		
		<h2>Professional Information</h2>
		
		<label for="totalexperience">Total Experience:</label>
		 <select id="totalexperience" name="totalexperience"  value="${r.totalexperience}" required>
			<option value="">Select Total Experience</option>
			<option value="0-1">0-1 years</option>
			<option value="1-2">1-2 years</option>
			<option value="2-3">2-3 years</option>
			<option value="3-5">3-5 years</option>
			<option value="5+">5+ years</option>
		</select> <br>
		<br>
		
		<label>City Applying:</label> 
		<input type="text" id="cityapplying" name="cityapplying" pattern="[A-Z a-z]+" value="${r.cityapplying}" required> <br>
		<br> 
		
		<label>10th Percentage:</label> 
		<input type="number" id="10th_percentage" name="tenthpercentage" value="${r.tenthpercentage}" min="0" max="100" required> <br>
		<br>
		
		 <label>12th Percentage:</label> 
		 <input type="number" id="12th_percentage" name="twelvethpercentage" value="${r.twelvethpercentage}" min="0" max="100" required> <br>
		 <br> 
		 
		 <label>Highest Qualification:</label>
		  <select id="highest_qualification" name="highestqualification"  value="${r.highestqualification}" required> 
		<option value="">Select Highest Qualification</option> 
			<option value="bachelors">Bachelor's Degree</option>
			<option value="masters">Master's Degree</option>
			<option value="doctorate">Doctorate Degree</option>
			<option value="diploma">Diploma</option>
		</select> <br>
		<br> 
		
		<label>Year of Highest Qualification:</label> 
			<select id="year_of_highest_qualification" name="yearofhighestqualification"  value="${r.yearofhighestqualification}" required>
		 <option value="">Select Year of Highest Qualification</option> 
			<option value="2010">2010</option>
			<option value="2011">2011</option>
			<option value="2012">2012</option>
			<option value="2013">2013</option>
			<option value="2014">2014</option>
			<option value="2015">2015</option>
			<option value="2016">2016</option>
			<option value="2017">2017</option>
			<option value="2018">2018</option>
			<option value="2019">2019</option>
			<option value="2020">2020</option>
		</select><br>
		<br>
			<label>Current Company:</label>
			<input type="text" id="currentCompany" name="currentCompany" pattern="[A-Z a-z]+"  value="${r.currentCompany}" required> <br>
			<br>

			<label>Current Designation:</label>
			<input type="text" id="currentDesignation" name="currentDesignation" pattern="[A-Z a-z]+" value="${r.currentDesignation}" required> <br>
			<br>

			<label>Current CTC:</label>
			<input type="number" id="currentCTC" name="currentCTC" value="${r.currentCTC}" min="0" max="999999999" required> <br>
			<br>

			<label>Resume:</label>
			<input type="file" id="resume" name="resume" accept=".pdf,.doc,.docx" required> <br>
			<br>

			<!-- <label> <input type="checkbox" id="termsAndConditions" name="termsAndConditions" required> <br>
			<br>
				I agree to the terms and conditions
		   </label> -->
		 <button type="submit" value="submit">Submit</button>
	</form>
</body>
</html>


