<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>숫자 맞추기 게임 v0.1</title>
</head>
<body>
	<h1>숫자 맞추기 게임</h1>
	<h2>1~100사이 숫자를 입력하여 컴퓨터의 숫자를 맞춰보세요</h2>
	<!-- action을 비우면 자기자신값을 가진다. -->
	<form action="">
		숫자 : <input type="number" name="num">
		<input type="submit" value="정답확인">
	</form>
	<h2>${msg}</h2>
</body>
</html>