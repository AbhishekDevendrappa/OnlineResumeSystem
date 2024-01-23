<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Job Seeker Registration</title>
<style>
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

body {
	font-family: Arial, Helvetica, sans-serif;
}

input[type=text], input[type=password], input[type=email] {
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
</style>
</head>
<body>

	<div class="toolbar">
		<h1>Welcome To Online Resume System</h1>
		<a href="gohome"><button type="submit">Home</button></a>
	</div>
	<div class="imgcontainer">
		<img src="https://www.w3schools.com/howto/img_avatar2.png"
			alt="Avatar" class="avatar">
		<h2>JobSeeker Registration</h2>
	</div>
<h2 id="error" style="text-align: center;"></h2>
	<div class="container">
		<h2>Job Seeker Registration</h2>
		<form action="change" method="post" onsubmit="return(validatePassword())">
			<h2>${errorMsg}</h2>

			<label>User name:</label> 
			    <input type="text" name="Username" placeholder="UserName" minlength="8" required> 	
			    
			<label>Password:</label>
			    <input type="password" name="newpassword" placeholder="Password" id="password" minlength="0" required> 
			        
			<label>Confirm Password:</label> 
				<input type="password" name="confirmpassword" id="confirmpassword" placeholder="Confirmpassword" minlength="0" required>

			<button type="submit">Register</button>
		</form>
	</div>
	<script>
		    function validatePassword() {
			var password = document.getElementById("password").value;
			var confirmPassword = document.getElementById("confirmpassword").value;
			if (password != confirmPassword) {
				document.getElementById("error").innerHTML = "Passwords do not match!";
				return false;
			}
			return true;
		}
	</script>
</body>
</html>
