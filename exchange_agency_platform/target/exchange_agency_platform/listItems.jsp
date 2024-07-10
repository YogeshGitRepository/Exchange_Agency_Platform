<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Available Listings</title>
</head>
<body>
    <h1>Available Listings</h1>
    <ul>
        <c:forEach var="item" items="${items}">
            <li>${item.name} - ${item.category} - ${item.brand} - ${item.features}
                <a href="updateItem?id=${item.id}">Update</a>
            </li>
        </c:forEach>
    </ul>
    <a href="index.jsp">Back to Home</a>
</body>
</html>
