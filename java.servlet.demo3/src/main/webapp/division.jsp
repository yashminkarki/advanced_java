<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Division through jsp</title>
</head>
<body>

<form action="DivisionServlet" method="post">
Enter two numbers:
<p>
<input type="text" name="first"><p>
<input type="text" name="second"><p>
<input type="submit" value="Divide">

</form>
The division is:
${outcome}

</body>
</html>