<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Online Resume System</title>

<style>
body {
  background-image: url(https://png.pngtree.com/background/20210709/original/pngtree-gradient-jobs-business-investment-picture-image_925027.jpg);
  background-repeat: no-repeat;
  background-position: center center;
  background-attachment: fixed;
  background-size: cover;
}

h1 {
  color: #ffffff;
  font-size: 48px;
  text-align: center;
}

button {
  background-color: #ffffff;
  border: none;
  color: #000000;
  padding: 10px 20px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer;
  border-radius: 4px;
}

a {
  text-decoration: none;
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
  padding: 5px 5px;
  border-radius: 5px;
  cursor: pointer;
}

.toolbar button:hover {
  background-color: #0069d9; /* Change this to the background color you want for the button on hover */
}



</style>
</head>
<body  align="center">
 <div class="toolbar">
    <h1>Well Come to Jobs.Com</h1>
    
    <a href="alogin"><button type="submit">Admin Login</button></a>
	<a href="ulogin"><button type="submit">User Login</button></a>
	<a href="rlogin"><button type="submit">Recuiter Login</button></a>
    
    
    </div>


	
</body>
</html>