<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<!-- bootstrap -->
	<link rel="stylesheet" href="/pagination-front/res/css/bootstrap.min.css">
	<link rel="stylesheet" href="/pagination-front/res/css/bootstrap-theme.min.css">
   <script src="/pagination-front/res/js/jquery-1.7.2.min.js"  type="text/javascript"></script>
	<script src="/pagination-front/res/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
	<h3 align="center">商品信息</h3>
	<table class="table table-striped">
	 	<tr>
	 	<td align="center">商品名称</td>
	 	<td align="center">商品价格</td>
	 	<td align="center">商品备注</td>
	 	<td align="center">商品创建时间</td>
	 	</tr>
	 		<c:forEach items="${ pagination.list }" var="items">
	 	<tr>
	 			<td align="center">${ items.name }</td>
	 			<td align="center">${ items.price }</td>
	 			<td align="center">${ items.detail }</td>
	 			<td align="center">${ items.createtime }</td>
	 	</tr>
	 		</c:forEach>
	</table>

		<div align="right" class="page pb15">
				<span class="r inb_a page_b">
					<c:forEach items="${pagination.pageView }" var="page">
						${page }
					</c:forEach>
				</span>
			</div>
	</div>		
</body>
</html>