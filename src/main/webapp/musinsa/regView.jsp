<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<link rel="stylesheet" href="css/layout.css">
<link rel="stylesheet" href="css/reg.css">
<link rel="shortcut icon" href="image/faviconV2.jpg" type="image/x-icon">
</head>
<body>
	<%@include file="../header.jsp"%>
	<main>
		<br>
		<h3>동해의 옷장 회원가입</h3>
		<form action="" method="POST">
				<input type="hidden" value="${memberno }" name="memberno" id="jsmemberno">
				<input type="hidden" name="joindate" id="jsjoindate">
				<input type="hidden" value="${mblevel }" name="mblevel">
			<table>
				<tr>
					<th>이름</th>
					<td><input type="text" placeholder="이름을 입력해주세요." name="name"
						id="jsname"></td>
				</tr>
				<tr>
					<th>닉네임</th>
					<td><input type="text" placeholder="닉네임을 입력해주세요."
						name="nickname" id="jsnickname"></td>
				</tr>
				<tr>
					<th>ID</th>
					<td><input type="text" placeholder="ID를 입력해주세요." name="id"
						id="jsid"></td>
				</tr>
				<tr>
					<th>비밀번호</th>
					<td><input type="password" placeholder="비밀번호를 입력해주세요."
						name="password" id="jspassword" maxlength="15"></td>
				</tr>
				<tr>
					<th>핸드폰</th>
					<td><input type="text" placeholder="번호를 입력해주세요." name="phone"
						id="jsphone"></td>
				</tr>
				<tr>
					<th>주소</th>
					<td><input type="text" placeholder="주소 입력해주세요." name="address"
						id="jsaddress"></td>
				</tr>
				<tr>
					<td colspan="2">
						<button type="button" onclick="func_reg()">등록</button>
						<button type="reset">다시쓰기</button>
					</td>
				</tr>
			</table>
		</form>
	</main>
	<%@include file="../footer.jsp"%>
	<script type="text/javascript" src="./js/reg.js"></script>
</body>
</html>