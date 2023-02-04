<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원목록</title>
<link rel = "stylesheet" href="css/layout.css">
<%@include file="../header.jsp" %>
</head>
<body>
	<main>
		<h3>동해의 옷장 회원목록</h3>

		<table>
			<tr>
				<th>회원번호</th>
				<th>이름</th>
				<th>닉네임</th>
				<th>전화번호</th>
				<th>주소</th>
				<th>가입날짜</th>
				<th>ID</th>
			</tr>

			<c:forEach items="${list }" var="vo">
				<tr>
					<td>${vo.memberno }</td>
					<td>${vo.name }</td>
					<td>${vo.nickname }</td>
					<td>${vo.phone }</td>
					<td>${vo.address }</td>
					<td>${vo.joindate }</td>
					<td>${vo.id }</td>
				</tr>
			</c:forEach>
		</table>
	</main>
</body>
<%@include file="../footer.jsp" %>
</html>