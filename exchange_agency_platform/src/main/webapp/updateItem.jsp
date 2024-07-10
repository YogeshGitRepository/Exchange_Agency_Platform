<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Update Item</title>
</head>
<body>
    <h1>Update Item</h1>
    <form action="updateItem" method="post">
        <input type="hidden" name="id" value="${item.id}">
        Name: <input type="text" name="name" value="${item.name}"><br>
        Category: <input type="text" name="category" value="${item.category}"><br>
        Brand: <input type="text" name="brand" value="${item.brand}"><br>
        Features: <input type="text" name="features" value="${item.features}"><br>
        <input type="submit" value="Update Item">
    </form>
    <a href="index.jsp">Back to Home</a>
</body>
</html>
