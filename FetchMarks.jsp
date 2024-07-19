<%@page import="gradepro.StudentsGrades"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="gradepro.StudentsGrades"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Fetch_Marks</title>
</head>
<body>
<%
  	//String enteredRoll=request.getParameter("studentRoll");
	//int convertedRoll=Integer.parseInt(enteredRoll);
	  String enteredRoll=request.getParameter("studentRoll");
	  String enteredName=request.getParameter("studentName");
	  out.println(enteredRoll);
	  out.println(enteredName);
	
	String marks= StudentsGrades.getMarks(enteredRoll, enteredName);
	out.println(marks);
	
	double finalMarks=Double.parseDouble(marks);
	
	if(finalMarks>=90)
	{
		out.print("<h1>Congratulations!</h1>");
		out.print("<h2>"+enteredName+" you have got "+marks+"</h2>");
		out.print("<h2>Your final grade is <b>A+</b><h2>");
		
	}
	
	else if(finalMarks>=80 && finalMarks<=89)
	{
		out.print("<h1>Congratulations!</h1>");
		out.print("<h2>"+enteredName+" you have got "+marks+"</h2>");
		out.print("<h2>Your final grade is <b>B+</b><h2>");
		
	}
	
	else if(finalMarks>=70 && finalMarks<=79)
	{
		out.print("<h1>Congratulations!</h1>");
		out.print("<h2>"+enteredName+" you have got "+marks+"</h2>");
		out.print("<h2>Your final grade is <b>C+</b><h2>");
		
	}
	
	else if(finalMarks>=60 && finalMarks<=69)
	{
		out.print("<h1>Congratulations!</h1>");
		out.print("<h2>"+enteredName+" you have got "+marks+"</h2>");
		out.print("<h2>Your final grade is <b>D+</b><h2>");
		
	}
	
	else
	{
		out.print("<h1>Sorry!</h1>");
		out.print("<h2>"+enteredName+" you have got "+marks+"</h2>");
		out.print("<h2>Better luck next time! :)<h2>");
	}
	
%>
</body>
</html>