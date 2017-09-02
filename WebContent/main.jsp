<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.bitstudy.qna.domain.Qna"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>메인 페이지</title>
</head>
<body>
	<h1>메인 페이지</h1>
	 <!-- qna.setNo(Integer.parseInt(request.getParameter("no"))); 
	 -->
	
	<%
	Qna qna = new Qna();
	
	
	qna.setGroupNo(request.getParameter("groupNo"));
	qna.setName(request.getParameter("name"));
	qna.setTitle(request.getParameter("title"));
	qna.setContent(request.getParameter("content"));
	
	%>
	
	
    <c:out value ="${qna.groupNo}- ${qna.title} - ${qna.name} - ${qna.content}" /><br>
	
	

	
</body>
</html>