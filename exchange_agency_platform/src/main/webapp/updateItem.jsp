<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Update Item</title>
    <style>
        body {
            font-family: 'Arial', sans-serif;
            background-color: #f4f4f9;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            color: #333;
        }
        .container {
            background: white;
            padding: 40px;
            border-radius: 8px;
            box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);
            text-align: center;
        }
        h1 {
            color: #5a67d8;
            margin-bottom: 20px;
        }
        form {
            display: flex;
            flex-direction: column;
            align-items: center;
        }
        input[type="text"] {
            width: 80%;
            padding: 10px;
            margin: 10px 0;
            border: 1px solid #ccc;
            border-radius: 5px;
        }
        input[type="submit"] {
            padding: 10px 20px;
            color: white;
            background-color: #5a67d8;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }
        input[type="submit"]:hover {
            background-color: #434190;
        }
        a {
            display: inline-block;
            margin-top: 20px;
            text-decoration: none;
            color: #5a67d8;
            font-weight: bold;
            transition: color 0.3s ease;
        }
        a:hover {
            color: #434190;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Update Item</h1>
        <form action="updateItem" method="post">
            <input type="hidden" name="id" value="${item.id}">
            <input type="text" name="name" placeholder="Name" value="${item.name}">
            <input type="text" name="category" placeholder="Category" value="${item.category}">
            <input type="text" name="brand" placeholder="Brand" value="${item.brand}">
            <input type="text" name="features" placeholder="Features" value="${item.features}">
            <input type="submit" value="Update Item">
        </form>
        <a href="index.jsp">Back to Home</a>
    </div>
</body>
</html>
