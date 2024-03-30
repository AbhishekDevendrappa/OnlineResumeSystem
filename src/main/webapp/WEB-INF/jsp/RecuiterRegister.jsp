<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Job Seeker Registration</title>
<style>

.toolbar {
  background-color: #333; /* Change this to the background color you want for the toolbar */
  color: #fff; /* Change this to the font color you want for the toolbar */
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
body {
	font-family: Arial, Helvetica, sans-serif;
}

input[type=text], input[type=password],input[type=email], input[type=Number], input[type=text] {
	width: 100%;
	padding: 12px 20px;
	margin: 8px 0;
	display: inline-block;
	border: 1px solid #ccc;
	box-sizing: border-box;
}

button {
	background-color: #04AA6D;
	color: white;
	padding: 14px 20px;
	margin: 8px 0;
	border: none;
	cursor: pointer;
	width: 100%;
}

button:hover {
	opacity: 0.8;
}

.imgcontainer {
	text-align: center;
	margin: 24px 0 12px 0;
}

img.avatar {
	width: 10%;
	border-radius: 10%;
}

.container {
	max-width: 500px;
	margin: 0 auto;
	padding: 50px;
	background-color: #f5f5f5;
	border: 1px solid #ddd;
	border-radius: 5px;
}
function add(username) {
  var key = event.keyCode;
  return ((key >= 65 && key <= 90) || key == 8);
};

</style>
</head>
<body>

	<div class="toolbar">
		<h1>Welcome To Jobs.Com</h1>
		<a href="gohome"><button type="submit">Home</button></a>
	</div>
	<div class="imgcontainer">
		<img src="https://www.w3schools.com/howto/img_avatar2.png" alt="Avatar" class="avatar">
		<h2>Recuiter Registration</h2>
	</div>

	<div class="container">
		<h2>Recuiter Registration</h2>
		<form action="addreciuter" method="POST">
			
				<label for="name">User name:</label> 
				<input type="text" pattern="[A-Z a-z]+" name="name" placeholder="UserName"  minlength="5" required>
			
			
				<label for="email">Email:</label> 
				<input type="email"  name="email" placeholder="abc@gmail.com"  required>
			
			
				<label for="password">Password:</label> 
				<input type="password"  name="password" placeholder="password" minlength="8" required>
				
				<label for="Number">Phone Number:</label> 
				<input type="Number"  name="number" placeholder="Phone Number" required>
				
				<label for="Number">Company Name:</label> 
				<input type="text"  name="company" placeholder="Company Name" required>
			
			   <button type="submit">Register</button>
		</form>
	</div>
</body>
</html>
