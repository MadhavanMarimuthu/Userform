<%@page import="dto.User"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>User form</h2>
<form action="UserFirstController" method="get">
<div>
<table border="1">
<tr>
<th>Name</th>
<th>FatherName</th>
<th>EmailId</th>
<th>PhoneNo</th>
<th>Address</th>
</tr>
<%List<User> user= (List<User>)request.getAttribute("key");
if(null!=user && user.size()>0){
for(User userform:user){
	%>
	<tr>
	<td><%= userform.getName() %></td>
	<td><%= userform.getFatherName() %></td>
	<td><%= userform.getEmailId() %></td>
	<td><%= userform.getPhoneNo() %></td>
	<td><%= userform.getAddress() %></td>
	</tr>
<% }
}else{
%>
<tr><td colspan="5">No Record Found</td>
<%}%>
</table>
</div>
<button onclick="submit">create user details</button>
<button><a href="emptycontroller">back</a></button>
</form>
</body>
</html>