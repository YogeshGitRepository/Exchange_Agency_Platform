<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Available Listings</title>
    <!-- Bootstrap CSS -->
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background-color: #f8f9fa;
            padding: 20px;
        }
        .container {
            max-width: 800px;
            margin: 0 auto;
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
        ul {
            list-style-type: none;
            padding: 0;
        }
        li {
            padding: 15px;
            border-bottom: 1px solid #ddd;
        }
        li:last-child {
            border-bottom: none;
        }
        .description {
            color: #666;
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
        img {
            max-width: 150px;
            border-radius: 5px;
        }
    </style>
    <script>
        // JavaScript function to display a pop-up message
        function displayPopUp(message) {
            alert(message);
        }
    </script>
</head>
<body>
    <div class="container">
        <h1>Available Listings</h1>
        <ul>
            <c:forEach var="item" items="${items}">
                <li class="list-group-item">
                    <strong>${item.name}</strong> - ${item.category} - ${item.brand}<br>
                    Features: ${item.features}<br>
                    Description: <span class="description">${item.description}</span><br>
                    Condition: ${item.condition}<br>
                    <!-- Displaying photo as base64 encoded image -->
                    <img src="data:image/jpeg;base64,${item.photoBase64}" alt="${item.name} Photo"><br>
                    <a href="updateItem?id=${item.id}" class="btn btn-primary mt-2">Update</a>
                </li>
            </c:forEach>
        </ul>
        <a class="back-link" href="index.jsp">Back to Home</a>
    </div>

    <!-- JavaScript check to display pop-up if no items message is set -->
    <script>
        // Check if noItemsMessage exists in request attributes
        var noItemsMessage = "${requestScope.noItemsMessage}";
        if (noItemsMessage !== "") {
            // Display pop-up with noItemsMessage
            displayPopUp(noItemsMessage);
        }
    </script>
    <!-- Bootstrap JS (optional) -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
