<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="lightgreen">
	<form action="login" method="post">
		Login
		<table>
			<tr>
				<td>Email</td>
				<td><input type="text" name="emailid" id="emailid" /></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password" id="password"></td>
			</tr>
			<tr>
				<td><input type="submit" name="submit" value="Login" id="submit" /></td>
			</tr>
		</table>
		
		${msg}
	</form>
</body>
</html>