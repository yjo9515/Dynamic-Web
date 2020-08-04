<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<% 
	request.setCharacterEncoding("utf-8");
	String id =request.getParameter("id");
	String pw =request.getParameter("pw");
%>
<%
if(id == null || id.length()==0){
%>
아이디를입력하세요<% 
}
%>

<% if(id.equals("admin")){%>
		관리자로 로그인하였습니다.
<% } else{%>
<%=id  %>님 환영합니다
<%}%>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>이미지 리스트</h2>
	
	<ul>
	<% for(int i=0; i<10; i++){ %>
	<li>
		<div><img src='./image/img<%=i %>.png' alt='이미지<%=i %>' /></div>
	</li>
	<%} %>
	</ul>
</body>
</html>