<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<span>${data }</span>
	<form action="login">
		<input type="text" name="username" />
		<input type="text" name="password" />
		<button type="submit">login</button>
	</form>
</body>
</html>