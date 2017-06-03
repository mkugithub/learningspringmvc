<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admission Successful</title>
</head>
<body>
						
	<h1>${headerMessage}</h1>

	<h3>Congratulation! Student admission form for engineering courses submitted sucessfully.</h3>
	<h2>Details Submitted By You:</h2>

	<table>

		<tr>
			<td>Student Name:</td>
			<td>${student1.studentName }
		</tr>

		<tr>
			<td>Student Hobby:</td>
			<td>${student1.studentHobby }
		</tr>
		
		<tr>
			<td>Student`s mobile :</td>
			<td>${student1.studentMobile }
		</tr>
		
		<tr>
			<td>Student Date of Birth:</td>
			<td>${student1.studentDOB }
		</tr>
		
		<tr>
			<td>Student`s Skill Sets:</td>
			<td>${student1.studentSkills }
		</tr>
		
		<tr>
			<td bgcolor="red">Student`s Address:</td>
			<td> Country:</td>
			<td bgcolor="green">${student1.studentAddress.country}</td>
			<td> City:</td>
			<td>${student1.studentAddress.city}</td>
			<td> Street:</td>
			<td>${student1.studentAddress.street}</td>
			<td> Pin code:</td>
			<td>${student1.studentAddress.pincode}</td>
		</tr>
		
	</table>

  </body>
  </html>