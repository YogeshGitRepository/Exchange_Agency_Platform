<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Exchange Agency Platform</title>
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
            text-align: center;
            background: white;
            padding: 50px;
            border-radius: 8px;
            box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);
        }
        h1 {
            color: #5a67d8;
        }
        .button {
            display: inline-block;
            margin: 10px 20px;
            padding: 10px 20px;
            text-decoration: none;
            color: white;
            background-color: #5a67d8;
            border-radius: 5px;
            transition: background-color 0.3s ease;
            font-size: 16px;
        }
        .button:hover {
            background-color: #434190;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Welcome to Mary's Exchange Agency Platform</h1>
        <a href="listItems" class="button">Browse Listings</a>
        <a href="addItem" class="button">Add New Item</a>
    </div>
</body>
</html>
