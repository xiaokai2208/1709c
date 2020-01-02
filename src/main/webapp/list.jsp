<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="<%=request.getContextPath()%>/css/css.css" rel="stylesheet">
<script type="text/javascript"src="<%=request.getContextPath()%>/js/jquery-1.8.2.min.js"></script>
</head>
<body>
	<form id="ti" action="list" method="post">
		查找<input type="text" name="mohu">
		<input id="fenshu" type="text" name="pageNum"> 
		<input type="submit" value="查询">
	</form>
	<table>
		<tr>
			<th>ID</th>
			<th>商品</th>
			<th>操作</th>
		</tr>
		<c:forEach var="a" items="${list }">
			<tr>
			<td>${a.id }</td>
			<td>${a.name }</td>
			<td><button id="shan" value="${a.id }">删除</button><button id="xiu" value="${a.id }">修改</button><button id="xiang" value="${a.id }">详情</button></td>
		</tr>
		</c:forEach>
	</table>
	<a href="#" onclick="fen(1)">首页</a>
	<a href="#" onclick="fen(${page.prePage})">上一页</a>
	<a href="#" onclick="fen(${page.nextPage})">下一页</a>
	<a href="#" onclick="fen(${page.pages})">尾页</a>
	<br>
	<button id="tian">添加</button>
</body>
<script type="text/javascript">
	$("#shan").click(function() {
		var a = $("#shan").val();
		location = "shan?id="+a;
	});
	$("#xiang").click(function() {
		var a = $("#xiang").val();
		location = "show?id="+a;
	});
	$("#xiu").click(function() {
		var a = $("#xiu").val();
		location = "xiu.jsp?id="+a;
	});
	$("#tian").click(function() {
		location = "add.jsp";
	});
	function fen(p) {
		$("input:eq(2)").val(p);
		$("#ti").submit();
	}
</script>
</html>