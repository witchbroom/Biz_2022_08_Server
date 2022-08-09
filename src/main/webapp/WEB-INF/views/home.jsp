<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set value="${pageContext.request.contextPath}" var="rootPath" />
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%>
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

	<h1>안녕하세요</h1>

<div>
	<h3>로그인 정보</h3>
	<sec:authorize access="isAuthenticated()">
		<strong>아이디 : </strong> <sec:authentication property="principal.username" /><br>
		<strong>이메일 : </strong> <sec:authentication property="principal.email" /><br>
		<strong>이름 : </strong> <sec:authentication property="principal.realname" />
	</sec:authorize>
</div>

<form:form class="todoview" action="${rootPath}/todolist">
	<button>TODO 보기</button>
</form:form>
<form:form class="login" action="${rootPath}/user/login">
	<button>로그인</button>
</form:form>
<form:form class="join" action="${rootPath}/user/join">
	<button>회원가입</button>
</form:form>
<form:form class="logout" action="${rootPath}/logout">
	<button>로그아웃</button>
</form:form>


</body>
</html>