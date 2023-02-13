<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>마이페이지</title>
<link rel="shortcut icon" href="image/faviconV2.jpg" type="image/x-icon">
<link rel="stylesheet" href="css/layout.css">
<link rel="stylesheet" href="css/mypage.css">
<%@include file="../header.jsp"%>
</head>
<body>
	<main>
		<form action="" method="post">
			<h3>${vo.nickname }님의회원정보</h3>
			<br>
			<table>
				<tr>
					<th>이름</th>
					<td>${vo.name }</td>
				</tr>
				<tr>
					<th>아이디</th>
					<td>${vo.id }</td>
				</tr>
				<tr>
					<th>닉네임</th>
					<td>${vo.nickname }</td>
				</tr>
				<tr>
					<th>전화번호</th>
					<td>${vo.phone }</td>
				</tr>
				<tr>
					<th>주소</th>
					<td>${vo.address }</td>
				</tr>
				<tr>
					<th>가입날짜</th>
					<td>${vo.joindate }</td>
				</tr>
				<tr>
					<th colspan="2">
						<input type="hidden" value="${vo }">
						<button type="submit">정보수정</button>
					</th>
				</tr>
			</table>
		</form>
	</main>
</body>
<%@include file="../footer.jsp"%>
</html>