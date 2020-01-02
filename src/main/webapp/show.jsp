<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="<%=request.getContextPath()%>/css/css.css" rel="stylesheet">
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.8.2.min.js"></script>
</head>
<body>
	<table>
		<tr>
			<th>ID</th>
			<th>商品</th>
			<th>尺寸</th>
			<td>单价</td>
			<td>数量</td>
			<td>标签</td>
			<th>品牌</th>
			<th>类型</th>
		</tr>
		<c:forEach var="a" items="${list }">
			<tr>
			<td>${a.id }</td>
			<td>${a.name }</td>
			<td>${a.chicun }</td>
			<td>${a.danjia }</td>
			<td>${a.shuliang }</td>
			<td>${a.biaoqian }</td>
			<td>${showpin }</td>
			<td>${showzhou }</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>