<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="login" method="post">
		<input name="username" type="text" />
		<input name="password" type="text" />
		<button type="submit">Login</button>
	</form>
	<b>${error}</b>
</body>
</html>