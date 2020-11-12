<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>

<h1>build your own pizza</h1>

<form method="post" action="/customconfirmation">
	<h2>size:</h2>
	<select name="size">
	    <option value="small">small</option>
	    <option value="medium">medium</option>
	    <option value="large">large</option>
  </select>
  <br />
  <h2>toppings:</h2>
  <select name="toppings">
  		<c:forEach var = "toppings" begin = "MyController.toppingChoices[0]" end = "MyController.toppingChoices[-1]">
  		</c:forEach>
		<option value="1">1</option>
	    <option value="2">2</option>
	    <option value="3">3</option>
	    <option value="4">4</option>
	    <option value="5">5</option>
	    <option value="6">6</option>
  </select><br />
  <br />
  Gluten-Free Crust? ($2.00 extra):<br /><input type="checkbox" name="gf"/><br />
  <br />
  special instructions:<br /> 
	<textarea name="special" style="width:250px;height:150px;"></textarea>
	<br />
  
  
  
  
  <input type="submit">


</form>



	<a href="/homepage">Back to Homeback</a><br />


</body>
</html>