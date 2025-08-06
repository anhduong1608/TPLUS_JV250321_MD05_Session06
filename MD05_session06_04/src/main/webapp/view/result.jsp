
<%--
  Created by IntelliJ IDEA.
  User: SONY
  Date: 06/08/2025
  Time: 2:49 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 20px;
            background-color: #f8f8f8;
        }

        #container {
            width: 100%;
            height: 100%;
            text-align: center;
        }

        h1 {
            color: #d57777;
            margin-bottom: 30px;
        }

        table {
            width: 100%;
            border-collapse: collapse;
            background-color: #ffffff;
        }

        th, td {
            padding: 12px 15px;
            border: 1px solid #ddd;
            text-align: center;
        }

        th {
            background-color: #f2f2f2;
            font-weight: bold;
        }

        tr:nth-child(even) {
            background-color: #f9f9f9;
        }

        tr:hover {
            background-color: #f1f1f1;
        }

        a {
            text-decoration: none; /* ❌ Xóa gạch chân */
            color: #007bff;         /* ✅ Màu xanh giống Bootstrap */
            margin: 0 5px;
        }

        a:hover {
            text-decoration: underline; /* ✅ Gạch chân khi hover */
            color: #0056b3;
        }

        .add-product-link {
            display: inline-block;
            margin-top: 20px;
            padding: 10px 20px;
            background-color: #28a745;
            color: white;
            border-radius: 4px;
            font-size: 16px;
            text-decoration: none;
        }

        .add-product-link:hover {
            background-color: #218838;
        }
        .btn-update {
            color: #0a7cff;
            text-decoration: none;
            font-weight: bold;
        }

        .btn-update:hover {
            text-decoration: underline;
            color: #0056b3;
        }

        /* Liên kết xóa */
        .btn-delete {
            color: #ff3b3b;
            text-decoration: none;
            font-weight: bold;
        }

        .btn-delete:hover {
            text-decoration: underline;
            color: #cc0000;
        }
    </style>
</head>
<body>
<h1>Danh sach user</h1>
<table>
    <thead>
    <tr>
        <th>User</th>
        <th>Email</th>
        <th>Phone</th>
    </tr>
    </thead>
    <c:forEach var="user" items="${users}">
    <tr>
        <td>${user.name}</td>
        <td>${user.email}</td>
        <td>${user.phoneNumber}</td>
    </tr>
    </c:forEach>
</table>
</body>
</html>
