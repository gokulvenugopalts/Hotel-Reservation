<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Hotel Details</title>
</head>

<body bgcolor="lightgreen">
	<form action="loginpage" method="get">
		<center>
				<c:forEach items="${hotel}" var="hdetails">
			<h2>
		
	 ${msg }
	 ${hdetails.getHotelname()}
		</h2>
		<br>
		<br>
		<br>

				 ${hdetails.getAddress()} <br><br>
				 ${hdetails.getCity()},
				 ${hdetails.getZip()} <br><br>
				 ${hdetails.getState()} <br><br>
				Rate: &nbsp&nbsp${hdetails.getRate()} <br><br>
				 
		</c:forEach>
		<input type="submit" value="Book Hotel" />
		</center>
	</form>
</body>
</html>