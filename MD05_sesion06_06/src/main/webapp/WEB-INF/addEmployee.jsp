<%--
  Created by IntelliJ IDEA.
  User: SONY
  Date: 06/08/2025
  Time: 10:38 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html><body>
<h2>Thêm nhân viên mới</h2>
<form method="post" action="/employees">
    Tên: <input type="text" name="name"/><br/>
    Email: <input type="email" name="email"/><br/>
    Vị trí: <input type="text" name="position"/><br/>
    <input type="submit" value="Thêm"/>
</form>
</body></html>
