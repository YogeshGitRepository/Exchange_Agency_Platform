<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add New Item</title>
    <!-- Bootstrap CSS -->
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            padding: 20px;
            background-color: #f4f4f9;
            display: flex;
            justify-content: center;
            align-items: center;
            min-height: 100vh;
        }
        .form-container {
            max-width: 600px;
            background: white;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);
        }
        h1 {
            text-align: center;
            margin-bottom: 30px;
            color: #007bff;
        }
        .form-group {
            margin-bottom: 20px;
        }
        .form-control, .form-control-file {
            border-radius: 5px;
        }
        .submit-btn {
            width: 100%;
            padding: 10px;
            background-color: #007bff;
            color: #fff;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }
        .submit-btn:hover {
            background-color: #0056b3;
        }
        .back-link {
            display: block;
            margin-top: 20px;
            text-align: center;
            color: #007bff;
            font-weight: bold;
            transition: color 0.3s ease;
        }
        .back-link:hover {
            color: #0056b3;
        }
    </style>
</head>
<body>
    <div class="form-container">
        <h1>Add New Item</h1>
        <form action="addItem" method="post" enctype="multipart/form-data">
            <div class="form-group">
                <label for="name">Name:</label>
                <input type="text" id="name" name="name" class="form-control" required>
            </div>
            <div class="form-group">
                <label for="category">Category:</label>
                <input type="text" id="category" name="category" class="form-control" required>
            </div>
            <div class="form-group">
                <label for="brand">Brand:</label>
                <input type="text" id="brand" name="brand" class="form-control" required>
            </div>
            <div class="form-group">
                <label for="features">Features:</label>
                <input type="text" id="features" name="features" class="form-control" required>
            </div>
            <div class="form-group">
                <label for="description">Description:</label>
                <textarea id="description" name="description" class="form-control" required></textarea>
            </div>
            <div class="form-group">
                <label for="condition">Condition:</label>
                <input type="text" id="condition" name="condition" class="form-control" required>
            </div>
            <div class="form-group">
                <label for="userId">User ID:</label>
                <input type="text" id="userId" name="userId" class="form-control" required>
            </div>
            <div class="form-group">
                <label for="photo">Photo:</label>
                <input type="file" id="photo" name="photo" class="form-control-file" required>
            </div>
            <button type="submit" class="submit-btn">Add Item</button>
        </form>
        <a class="back-link" href="index.jsp">Back to Home</a>
    </div>
    <!-- Bootstrap JS (optional) -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
