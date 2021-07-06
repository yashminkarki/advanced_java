<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Subtraction through jsp</title>
</head>
<body>
<form action="SubtractionServlet" method="post">
Enter two numbers:
<p>
<input type="text" name="first"><p>
<input type="text" name="second"><p>
<input type="submit" value="Subtract">

</form>
The subtraction result is
${outcome}


</body>
</html>