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
    <div class="bg-white p-10">
      <h1 class="text-5xl">Employee Details</h1>
      <form action="insert" class="flex flex-col p-10 gap-10">
        <input
          type="text"
          name="ename"
          placeholder="Enter Name"
          class="h-10 px-4 border-b-2 border-black"
        />
        <input
          type="number"
          name="esalary"
          placeholder="Enter Salary"
          class="h-10 px-4 border-b-2 border-black"
        />
        <input
          type="submit"
          value="Insert"
          class="h-10 px-4 bg-teal-700 text-xl font-bold"
        />
      </form>
    </div>
  </body>
</html>
