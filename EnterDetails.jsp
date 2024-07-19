<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Enter Students Details</title>
<style type="text/css">
.formbox{
			margin-top: 35px;
			border: 2px solid whitesmoke;
			height: 70%;
			margin-left: 350px;
			margin-right: 350px;
		}
</style>
</head>
<body>
<h1>Fill the details</h1>
<fieldset>
<legend>Students Deatails:</legend>
<form action="FetchMarks.jsp" method="POST" class="formbox">

<div>
<label for="stuRoll">Student's RollNo:</label>
<input type="text" id="stuName" name="studentRoll">
</div>
<br/>

<div>
<label for="stuName">Student's Name:</label>
<input type="text" id="stuName" name="studentName">
</div>
<br/>


<div>
<label for="stuClass">Student's class:</label>
<input type="number" id="stuClass" name="studentClass">
</div>
<br/>



<div>
<input type="submit" value="See Results!">
</div>
<br/>

</form>

</fieldset>
</body>
</html>