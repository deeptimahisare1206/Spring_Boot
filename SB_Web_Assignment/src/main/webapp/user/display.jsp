<%@page import="java.util.List"%>
<%@page import="com.mypackage.entity.Employee"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display Page</title>
</head>
<body>
<%
Iterable<Employee> li=(Iterable<Employee>)request.getAttribute("list");
for(Employee sd : li)
{
	 %>  
	  
	   Id:<%= sd.getEid()%>
	   Name:<%= sd.getEname() %>
	   Percent:<%= sd.getEsalary() %>
	  <%}

%>
<h1>

Display Page

</h1>



</body>
</html>