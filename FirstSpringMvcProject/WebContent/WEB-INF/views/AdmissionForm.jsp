<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Admission Form</title>
</head>

<link rel="stylesheet" href="<spring:theme code='styleSheet'/>" type="text/css"/>

<body>
	
	
	
	<a href="/FirstSpringMvcProject/admissionForm.html?siteLanguage=en">English</a>
	<a href="/FirstSpringMvcProject/admissionForm.html?siteLanguage=fr">French</a> 
	
	<p><a href="/FirstSpringMvcProject/admissionForm.html?siteTheme=green">Green</a>
	<a href="/FirstSpringMvcProject/admissionForm.html?siteTheme=red">Red</a>
	
	
	<h1>${headerMessage}</h1>
	
	<h3><spring:message code="label.admissionForm"/></h3>
	<%-- <form:errors path="student1.*"></form:errors> --%>
	
	<form action="/FirstSpringMvcProject/submitAdmissionForm.html" method="POST">

		<table>
			<tr>
				<td><spring:message code="Label.studentName"/></td> <td><input type="text" name="studentName" /></td>
			</tr>
			<tr>
				<td><spring:message code="Label.studentHobby"/></td><td><input type="text" name="studentHobby" /></td>
			</tr>

			<tr>
				<td><spring:message code="Label.studentMobile"/></td><td><input type="text" name="studentMobile" /></td>
			</tr>

			<tr>
				<td><spring:message code="Label.studentDOB"/></td><td><input type="text" name="studentDOB" /></td>
			</tr>

			<tr>
				<td><spring:message code="Label.studentSkills"/></td>
				<td><select name="studentSkills" multiple>
						<option value="Core Java">Core Java</option>
						<option value="Spring Core">Spring Core</option>
						<option value="Spring Mvc">Spring Mvc</option>
						<option value="Hibernate">Hibernate</option>
				</select></td>
			</tr>
		</table>
		
		<table>
			<tr><td><spring:message code="Label.studentAddress"/></td>
			<tr><td><spring:message code="Label.country"/></td><td><input type="text" name="studentAddress.country"/></td>
				<td><spring:message code="Label.city"/> </td><td><input type="text" name="studentAddress.city"/></td>
				<td><spring:message code="Label.street"/></td><td><input type="text" name="studentAddress.street"/></td>
				<td><spring:message code="Label.pincode"/></td><td><input type="text" name="studentAddress.pincode"/></td>
			</tr>
		</table>
		
		
		<input type="submit"  value="<spring:message code="label.submit.admissionForm"/>" >
	</form>


</body>
</html>