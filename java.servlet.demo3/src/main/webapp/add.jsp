<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Addition through jsp</title>
</head>
<body>

<form action="SumServlet" method="post">
Enter two numbers:
<p>
<input type="text" name="num1"><p>
<input type="text" name="num2"><p>
<input type="submit" value="Add">

</form>
The sum is:
${result}

</body>
</html>