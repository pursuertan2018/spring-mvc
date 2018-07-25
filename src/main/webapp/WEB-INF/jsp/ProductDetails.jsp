<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Save Product</title>
</head>
<body>
<div>
    <h4>the product has been saved.</h4>
    <h5>Detail:</h5>
    <li>Product Name:${product.name}</li>
    <li>Description:${product.description}</li>
    <li>Price:$${product.price}</li>
    <li>Flash Message:${message}</li>
</div>
</body>
</html>
