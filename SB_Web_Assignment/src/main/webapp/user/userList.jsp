<%@page import="java.util.List"%>
<%@page import="com.mypackage.entity.Employee"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display Page</title>
    <script src="https://cdn.tailwindcss.com"></script>
</head>
 <body class="bg-teal-700 text-center h-screen grid place-items-center">
   
 <h1 class="text-5xl">All Employee Details</h1>
  <div class="overflow-x-auto">
    <table class="min-w-full bg-white border border-gray-200 shadow-md rounded-lg">
      <thead class="bg-gray-300">
        <tr>
          <th class="px-6 py-4 text-left ">Employee ID</th>
          <th class="px-6 py-4 text-left ">Employee Name</th>
          <th class="px-6 py-4 text-left ">Salary</th>
          <th class="px-6 py-4 text-left ">Action</th>
          <th class="px-6 py-4 text-left ">Action</th>
        </tr>
      </thead>
<%
List<Employee> li=(List<Employee>)request.getAttribute("find");
for(Employee sd : li)
{
	 %>  
	  
	  

      <tbody>
        <tr class="border-t border-gray-200">
          <td class="px-6 py-4 text-gray-700"><%= sd.getEid()%></td>
          <td class="px-6 py-4 text-gray-700"><%= sd.getEname() %></td>
          <td class="px-6 py-4 text-gray-700"><%= sd.getEsalary() %></td>
       <%--   <td class="px-6 py-4 text-gray-700"><a href="delete?id=<%= sd.getEid() %>">Delete</a></td>
         <td class="px-6 py-4 text-gray-700"><a href="update?id=<%= sd.getEid() %>">Update</a></td>
        --%> 
        </tr>
      </tbody>
   

	  <%}

%>
 </table>
  </div>


</body>