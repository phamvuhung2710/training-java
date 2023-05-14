<%@page import="java.util.List"%>
<%@page import="dto.CourseDto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<b>Welcome: ${sessionScope.user.username}</b>
	<%
	List<CourseDto> list = (List<CourseDto>) request.getAttribute("courses");
	%>
	<table>
		<%
		for (CourseDto dto : list) {
		%>
		<tr>
			<td>
				<%=dto.getCourseCode()%>
			</td>
			<td>
				<%=dto.getTitle()%>
			</td>
		</tr>
		<%
		}
		%>
	</table>
</body>
</html>