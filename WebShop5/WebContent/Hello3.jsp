<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%! // 자바코드
    String name = "윤재섭";	// 선언문
    public String getName() {return name; } //처리문=스크립트릿   
     %>
<!DOCTYPE html>
<html>
<head>
<%
	String age = request.getParameter("age"); //스크립트릿
%>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>헬로 <%= name //표현식
	%></h2>
	<h3>나는<%= age %>살입니다. </h3>
</body>
</html>