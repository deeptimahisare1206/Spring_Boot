<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <script src="https://cdn.tailwindcss.com"></script>
</head>
<body class="bg-teal-700 text-center">
<div>
	<h1 class="font-5xl">
	Employee Details
	</h1>
	<form action="insert">
	
	<input type="text" name="ename">
	<input type="number" name="esalary">
	<input type="submit" value="Insert">
	</form>
	</div>
	<a href="view">pagal hai</a>
</body>
</html>