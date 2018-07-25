<%--
  Created by IntelliJ IDEA.
  User: ucs_tanpinghua
  Date: 2018/7/24
  Time: 14:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>add product form </title>
</head>
<body>
<form action="product_save.action" method="post">
    <fieldset>
        <legend>add a product</legend>
        <label>product name:</label>
        <input id="name" name="name" type="text"> <br/>
        <label>product description:</label>
        <input id="description" name="description" type="text"><br/>
        <label>product price:</label>
        <input id="price" name="price" type="text">
        <div id="buttons">
            <input type="submit" id="submit" value="add product">
        </div>
    </fieldset>
</form>
</body>
</html>
