<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Report</title>
</head>
<body bgcolor="lightgreen">

Current Hotel Bookings by &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp 
${email}


<center>
             <table border="1">
                    <tr>
                           <th>Hotel Name</th>
                           <th>Address</th>
                           <th>City</th>
                           <th>State</th>
                           <th>CheckIn date</th>
                           <th>CheckOut date</th>
                           <th>Confirmation Number</th>
                    </tr>
                    <c:forEach items="${resul}" var="hdetails">

                           <tr>
                              
                                  
                                 <td>${hdetails.getHotelname()}</td>
                                 <td>${hdetails.getAddress()}</td>
                                 <td>${hdetails.getCity()}</td>
                                 <td>${hdetails.getState()}</td>
                                 <td>${hdetails.getCheckin_date()}</td>
                                  <td>${hdetails.getCheckout_date()}</td>
                                      <td>${hdetails.getBookingid()}</td>
                                    </tr>
                    </c:forEach>
             </table>
             
       </center>

</body>
</html>