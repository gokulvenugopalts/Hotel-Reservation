<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="lightgreen">
<center>
<h1>${message}</h1><br><br><br><br>
<h2>${msg}</h2><br><br><br><br>
<form action="searchresult" method="post">
Search String:&nbsp
<input type="text" name="searchbox" id="searchbox" /><br><br>
<input type="submit" value="Find Hotels" />
</center>
</form>
</body>
</html>