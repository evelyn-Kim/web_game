<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>금광찾기</title>
</head>
<body>
	<h1>금광찾기</h1>
	<h2>컴퓨터가 숨겨둔 금을 찾아보세요</h2>
	<h3>X, Y 좌표를 입력하여 거리가 0이되도록 해보세요!</h3>
	<form action="">
		X좌표 : <input type="number" name="x" size="3">
		Y좌표 : <input type="number" name="y" size="3">
		<input type="submit" value="찾기">
	</form>
	<h2> ${msg} </h2>
</body>
</html>