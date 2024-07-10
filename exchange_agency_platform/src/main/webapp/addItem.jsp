<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Add New Item</title>
</head>
<body>
    <h1>Add New Item</h1>
    <form action="addItem" method="post" enctype="multipart/form-data">
        Name: <input type="text" name="name"><br>
        Category: <input type="text" name="category"><br>
        Brand: <input type="text" name="brand"><br>
        Features: <input type="text" name="features"><br>
        Description: <textarea name="description"></textarea><br>
        Condition: <input type="text" name="condition"><br>
        User ID: <input type="text" name="userId"><br>
        Photo: <input type="file" name="photo"><br>
        <input type="submit" value="Add Item">
    </form>
    <a href="index.jsp">Back to Home</a>
</body>
</html>
