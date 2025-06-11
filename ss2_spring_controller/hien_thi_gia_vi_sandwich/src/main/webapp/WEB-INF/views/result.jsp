<%--
  Created by IntelliJ IDEA.
  User: Nitro V
  Date: 6/10/2025
  Time: 9:59 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Gia Vi Voi Sandwich Duoc Chon</title>
</head>
<body>
<h1>Gia Vi Voi Sandwich Duoc Chon</h1>

<c:choose>
    <c:when test="${not empty condiments}">
        <ul>
            <c:forEach items="${condiments}" var="item">
                <li>${item}</li>
            </c:forEach>
        </ul>
    </c:when>
    <c:otherwise>
        <p>Khong gia vi nao duoc chon</p>
    </c:otherwise>
</c:choose>

</body>
</html>
