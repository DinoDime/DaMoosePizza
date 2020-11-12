<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body> 
<h1>We appreciate your review!</h1>

<form method="post" action="/confirmreview">
		Your name: <input type="text" name="name" /><br />
		Comments: <input type="text" name="comment" /><br />
		How do you rate us?: <input type="number" name="rating" /><br />
	<input type="submit" /><br />
	</form>
<a href="/homepage">Back to Homepage</a><br />