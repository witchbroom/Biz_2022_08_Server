<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="rootPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Insert title here</title>
</head>
<body>
	<form method="POST">
		<input name="t_seq" type="hidden" 
			value='<c:out value="${TODO.m_seq}" default ="0"/>' >
		<input name="t_sdate" placeholder="" value="${TODO.t_sdate}">
		<input name="t_time" placeholder="" value="${TODO.t_stime}">
		<input name="t_content" placeholder="할일을 적어주세요" value="${TODO.t_sdate}">
		<input name="t_edate" value="${TODO.t_edate}">
		<input name="t_etime" value="${TODO.t_etime}">
		<button>등록하기</button>		
	</form>
</body>
</html>