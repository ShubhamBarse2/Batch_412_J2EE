<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>



	<%
	for (int i = 1; i <= 100; i++) {
		if (i % 2 == 0) {
	%>
	<h1>

		Hii Good Morning
		<%=i%></h1>
	<%
	}	}
	%>


	<%
	// out.println("Welcome...!");

	//session.setAttribute("name", "Nikhil .. ");

	// System.out.println("Welcome TO TKA");
	%>

</body>
</html>