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
	<form action="xiu" method="post">
		ID<input type="text" name="id"><br>
		商品<input type="text" name="name"><br>
		尺寸<input type="text" name="chicun"><br>
		单价<input type="text" name="danjia"><br>
		数量<input type="text" name="shuliang"><br>
		标签<input type="text" name="biaoqian"><br>
		品牌<select id="pin" name="xiuname">
			
		</select>
		种类
		<select id="zhou" name="xiuname">
			
		</select>
		<input type="submit" value="修改">
	</form>
</body>
<script type="text/javascript">
	$.post("huipin",{},function(p){
		for ( var i in p) {
			$("#pin").append("<option value="+p[i].id+">"+p[i].name+"</option>");
		}
	},"json");
	$.post("huizhou",{},function(p){
		for ( var i in p) {
			$("#zhou").append("<option value="+p[i].id+">"+p[i].name+"</option>");
		}
	},"json");
	
</script>
</html>