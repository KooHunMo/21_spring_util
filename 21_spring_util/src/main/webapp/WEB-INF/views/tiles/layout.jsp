<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!-- taglib 선언후 tiles태그를 사용한다. -->
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><tiles:insertAttribute name="title"/> </title>
</head>
<body>

	<div style="background-color: lime; height: 100px;">
		<header>
			<tiles:insertAttribute name="header" />
		</header>
	</div>
	
	<div style="background-color: skyblue; height: 100px;">
		<aside>
			<tiles:insertAttribute name="side" />
		</aside>
	</div>
	
	<div style="height: 700px">
		<article>
			<tiles:insertAttribute name="content" />
		</article>
	</div>
	
	<div style="background-color: pink; height: 100px;">
		<footer>
			<tiles:insertAttribute name="footer" />
		</footer>
	</div>
	
</body>
</html>