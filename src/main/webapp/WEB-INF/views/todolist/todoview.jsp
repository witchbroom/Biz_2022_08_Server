<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="rootPath" value="${pageContext.request.contextPath}" />
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Insert title here</title>
</head>
<body>
	<form:form method="POST" action="${rootPath}/todolist/insert">
		<input name="t_seq" type="hidden"
			value='<c:out value="${TODO.t_seq}" default ="0"/>'>
		<input name="t_content" placeholder="할일을 적어주세요"
			value="${TODO.t_content}">
		<button>등록하기</button>
	</form:form>

	<form:form method="POST" action="${rootPath}/todolist/${t_seq}/update">
		<button>수정하기</button>
	</form:form>

	<table>
		<tr>
			<th>SEQ</th>
			<th>입력일자</th>
			<th>입력시각</th>
			<th>할일</th>
			<th>완료일자</th>
			<th>완료시각</th>
		</tr>
	<c:forEach items="${TODOS}" var="TODO">
		<tr>
			<td>${TODO.t_seq}</td>
			<td>${TODO.t_sdate}</td>
			<td>${TODO.t_stime}</td>
			<td>${TODO.t_content}</td>
			<td>${TODO.t_edate}</td>
			<td>${TODO.t_etime}</td>
		</tr>
	</c:forEach>
	</table>
</body>
</html>