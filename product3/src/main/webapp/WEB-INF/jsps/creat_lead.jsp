<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
<h2>Welcome To product Informestion</h2>
<form action="saveLead" method="post">
<pre>
Product Name<input type="text" name="ProductName"/>
Product Type <input type="text" name="ProductType"/>
Product Category<input type="text" name="ProductCategory"/>
Product Price<input type="text" name="ProductPrice"/>
<input type="submit" value="save"/>
</pre>
</form>

</body>
</html>