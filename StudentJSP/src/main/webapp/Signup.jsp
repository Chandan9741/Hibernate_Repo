<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String message=(String)request.getAttribute("message");
%>
<%
if(message!=null){
%>
<h3><%=message %></h3>
<%
}
%>
	<form action="save" method="post">
		<table>
			<tr>
				<td>Name :</td>
				<td><input type="text" name="student_name"></td>
			</tr>
			<tr>
			<td>Age :</td>
			<td><input type="number" name="age"></td>
			</tr>
			<tr>
			<td><input type="submit" value="submit"></td>
			</tr>
		</table>
	</form>
</body>
</html>