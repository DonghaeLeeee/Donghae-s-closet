<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

 <style>
ul > .class2 {
float: right;
}
</style>

<header>
	<div>
		<h1> <a href = "<%=request.getContextPath()%>"> 동해의 옷장</a></h1>
	</div>
</header>
<nav>
	<ul>
		<li class ="class1"><a href="<%=request.getContextPath()%>/reg.hrd">회원가입</a></li>
		<li class ="class1"><a href="<%=request.getContextPath()%>/like.hrd">좋아요</a></li>
		<li class ="class1"><a href="<%=request.getContextPath()%>">홈으로</a></li>
		
	
		<c:if test="${vo.id == null }">
			<li class ="class2"><a href="<%=request.getContextPath()%>/login.hrd">로그인</a></li>
		</c:if>
		
		<c:if test="${vo.id != null }">
			<li class ="class2"><a href="<%=request.getContextPath()%>/logout.hrd">로그아웃</a></li>
			<li class ="class2"><a href="<%=request.getContextPath()%>/list.hrd">회원리스트</a></li>
			<li class ="class2"><a href="<%=request.getContextPath()%>/mypage.hrd">${vo.nickname }님의 마이페이지</a></li>
		</c:if>
	</ul>
</nav>