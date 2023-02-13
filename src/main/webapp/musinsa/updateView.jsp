<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>정보수정</title>
<link rel="stylesheet" href="css/layout.css">
<link rel="stylesheet" href="css/reg.css">
<link rel="shortcut icon" href="image/faviconV2.jpg" type="image/x-icon">
</head>
<body>
	<%@include file="../header.jsp"%>
	<main>
		<br>
		<h3>동해의 옷장 회원정보수정</h3>
		<form action="update.hrd" method="POST">
				<input type="hidden" value="${memberno }" name="memberno" id="jsmemberno">
				<input type="hidden" name="joindate" id="jsjoindate">
			<table>
				<tr>
					<th>이름</th>
					<td><input type="text" value="${vo.name }" name="name"
						id="jsname" readonly="readonly"></td>
				</tr>
				<tr>
					<th>닉네임</th>
					<td><input type="text" value="${vo.nickname }"
						name="nickname" id="jsnickname"></td>
				</tr>
				<tr>
					<th>ID</th>
					<td><input type="text" value="${vo.id }" name="id"
						id="jsid" readonly="readonly"></td>
				</tr>
				<tr>
					<th>비밀번호</th>
					<td><input type="password" placeholder="사용하실 비밀번호를 입력해주세요"
						name="password" id="jspassword" maxlength="15"></td>
				</tr>
				<tr>
					<th>비밀번호 확인</th>
					<td><input type="password" placeholder="사용하실 비밀번호를 다시 입력해주세요"
						id="jspassword2" maxlength="15"></td>
				</tr>
				<tr>
					<th>핸드폰</th>
					<td><input type="text" value="${vo.phone }" name="phone"
						id="jsphone"></td>
				</tr>
				<tr>
					<th>주소</th>
					<td><input type="text" value="${vo.address }" name="address"
						id="jsaddress"></td>
				</tr>
				<tr>
					<td colspan="2">
						<button type="button" onclick="func_reg()">수정</button>
						<button type="reset">다시쓰기</button>
					</td>
				</tr>
			</table>
		</form>
		<div>
			<p style="text-align: center;">수정 가능 항목 : 닉네임, 비밀번호, 핸드폰, 주소</p>
		</div>
	</main>
	<%@include file="../footer.jsp"%>
	<script type="text/javascript" src="./js/update.js"></script>
</body>
</html>