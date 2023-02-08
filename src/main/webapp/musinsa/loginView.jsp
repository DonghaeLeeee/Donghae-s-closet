<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>동해네옷장 로그인</title>
<link rel="shortcut icon" href="image/faviconV2.jpg" type="image/x-icon">
<link rel="stylesheet" href="css/layout.css">
<link rel="stylesheet" href="css/login.css">
<%@include file="../header.jsp"%>
</head>
<body>
<main>
	<form action="" method="POST">
			<table>
					<tr>
						<th>아이디</th>
						<td><input type="text" name="id"></td>
					</tr>
					<tr>
						<th>비밀번호</th>
						<td><input type="password" name="password"> </td>
					</tr>
					<tr> <td colspan="2"><button style="float: right;">로그인</button></td> </tr>
			</table>
	</form>
</main>
</body>
<%@include file="../footer.jsp"%>
</html>