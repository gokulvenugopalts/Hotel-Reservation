<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js">
	
</script>
<script type="text/javascript">
	function generate(element) {

		var dateString = document.getElementById('checkin_date').value;
		var myDate = new Date(dateString);
		//var tomorrow = ;
		var dd = myDate.getDate() + 1;
		var mm = myDate.getMonth();
		var y = myDate.getFullYear();

		var someFormattedDate = dd + '/'+ mm + '/'+ y;

		$("#checkout_date").html(someFormattedDate);

	}
</script>
<body bgcolor="lightgreen">
	<form action="store" method="post">
		<center>
		Booking Details
		<table>
       <c:forEach items="${hotel}" var="hdetails">
              <tr>
                     <td>Name</td>
                     <td><input type="text" value="<c:out value="${hdetails.getHotelname()}" />" name="hotelname"></td>
              </tr>
              <tr>
                     <td>Address</td>
                     <td><input type="text" value="<c:out value="${hdetails.getAddress()}" />" name="address"></td>
              </tr>
              <tr>
                     <td>City</td>
                     <td><input type="text" value="<c:out value="${hdetails.getCity()}" />" name="city"></td>
              </tr>
              <tr>
                     <td>State</td>
                     <td><input type="text" value="<c:out value="${hdetails.getState()}" />" name="state"></td>
              </tr>
              <tr>
                     <td>Zip</td>
                     <td><input type="text" value="<c:out value="${hdetails.getZip()}" />" name="zip"></td>
              </tr>
              <tr>
                     <td>Rate</td>
                     <td><input type="text" value="<c:out value="${hdetails.getRate()}" />" name="rate"></td>

              </tr>
       </c:forEach>
       </table>
				 <fieldset style="width: 500px">
       <table>
       <tr><td>Email</td><td><input type="text" value="${emailid}" name="emailid"></td></tr>
       <tr><td>Checkin date:</td><td><input type="text" name="checkin_date" id="checkin_date" value="${today}" /></td></tr>
       <tr><td>Checkout date:</td><td><input type="text" name="checkout_date" id="checkout_date" value="${next}" ></td></tr>
       <tr><td><input type="submit" value="Place Reservation"></td></tr>
       </table>
       </fieldset>
		
		</center>
	</form>
</body>
</body>
</html>