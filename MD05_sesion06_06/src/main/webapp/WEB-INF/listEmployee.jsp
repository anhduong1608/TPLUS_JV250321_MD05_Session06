<%--
  Created by IntelliJ IDEA.
  User: SONY
  Date: 06/08/2025
  Time: 10:38 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html><body>
<h2>Danh sách nhân viên</h2>
<a href="/employees/add">Thêm nhân viên</a>
<table border="1">
    <tr><th>Name</th><th>Email</th><th>Position</th></tr>
    <c:forEach items="${employees}" var="emp">
        <tr>
            <td>${emp.name}</td>
            <td>${emp.email}</td>
            <td>${emp.position}</td>
        </tr>
    </c:forEach>
</table>
<c:forEach begin="1" end="${totalPages}" var="i">
    <a href="/employees?page=${i}">${i}</a>
</c:forEach>
</body></html>
