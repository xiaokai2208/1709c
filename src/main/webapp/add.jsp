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
	<form action="add" method="post">
		商品<input type="text" name="name"><br>
		尺寸<input type="text" name="chicun"><br>
		单价<input type="text" name="danjia"><br>
		数量<input type="text" name="shuliang"><br>
		标签<input type="text" name="biaoqian"><br>
		品牌<select id="pin" name="pin">
			<option value="中国">中国</option>
			<option value="美国">美国</option>
		</select>
		种类
		<select id="zhou" name="zhou">
			<option value="商品经济">商品经济</option>
			<option value="科技创新">科技创新</option>
		</select>
		<input type="submit" value="添加">
	</form>
</body>
<script type="text/javascript">
	
</script>
</html>