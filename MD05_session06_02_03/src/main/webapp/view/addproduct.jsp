<%--
  Created by IntelliJ IDEA.
  User: SONY
  Date: 06/08/2025
  Time: 1:28 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>add home</title>
    <style>
        /* Tổng thể container */
        #container {
            width: 400px;
            margin: 50px auto;
            padding: 25px 30px;
            background-color: #f9f9f9;
            border: 1px solid #ddd;
            border-radius: 8px;
            box-shadow: 0 4px 10px rgba(0, 0, 0, 0.1);
            font-family: 'Segoe UI', sans-serif;
        }

        /* Tiêu đề */
        #container h1 {
            text-align: center;
            margin-bottom: 20px;
            color: #333;
        }

        /* Nhãn */
        #container label {
            display: block;
            margin-top: 15px;
            font-weight: 500;
            color: #555;
        }

        /* Input fields */
        #container input[type="text"],
        #container input[type="number"] {
            width: 100%;
            padding: 10px 12px;
            margin-top: 5px;
            border: 1px solid #ccc;
            border-radius: 6px;
            box-sizing: border-box;
            transition: border-color 0.3s;
        }

        #container input:focus {
            border-color: #007bff;
            outline: none;
        }

        /* Nút submit và reset */
        #submit,
        #cancel {
            margin-top: 20px;
            padding: 10px 20px;
            border: none;
            border-radius: 6px;
            font-size: 16px;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }

        #submit {
            background-color: #007bff;
            color: white;
            margin-right: 10px;
        }

        #submit:hover {
            background-color: #0056b3;
        }

        #cancel {
            background-color: #6c757d;
            color: white;
        }

        #cancel:hover {
            background-color: #5a6268;
        }
    </style>
</head>
<body>
<div id="container">
    <h1> Thêm mới : </h1>
    <form action="/ListShow" method="post">
        <label for="product_name">product name</label>
        <input type="text" name="product_name" id="product_name" required><br>
        <label for="product_price">product price</label>
        <input type="number" name="product_price" id="product_price" required><br>
        <label for="product_description">product description</label>
        <input type="text" name="product_description" id="product_description"><br>
        <label for="product_image">product image</label>
        <input type="text" name="product_image" id="product_image"><br>
        <button type="submit" id="submit">Submit</button>
        <button type="reset" id="cancel">Cancel</button>
    </form>


</div>
</body>
</html>
