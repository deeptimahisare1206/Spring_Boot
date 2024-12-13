<%@page import="com.mypackage.entity.Employee"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Insert title here</title>
    <script src="https://cdn.tailwindcss.com"></script>
  </head>
  <body class="bg-teal-700 text-center h-screen grid place-items-center">
  
  <%
  
  Employee ey =(Employee) request.getAttribute("upemp");
    
  %>
  
  
    <div class="bg-white p-10">
      <h1 class="text-5xl">Employee Details</h1>
      <form action="updated" class="flex flex-col p-10 gap-10">
       <input
          type="hidden"
          name="eid"
          value="<%=ey.getEid()%>"
          class="h-10 px-4 border-b-2 border-black"
        />
        <input
          type="text"
          name="ename"
          value="<%=ey.getEname()%>"
          class="h-10 px-4 border-b-2 border-black"
        />
        <input
          type="number"
          name="esalary"
          value="<%=ey.getEsalary()%>"
          class="h-10 px-4 border-b-2 border-black"
        />
        <input
          type="submit"
          value="Update"
          class="h-10 px-4 bg-teal-700 text-xl font-bold"
        />
       <!--  <h1><a href="view">Show All</a></h1> -->
      </form>
    </div>
  </body>
</html>