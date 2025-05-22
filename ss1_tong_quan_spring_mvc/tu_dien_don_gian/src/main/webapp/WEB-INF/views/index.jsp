<%--
  Created by IntelliJ IDEA.
  User: Nitro V
  Date: 5/23/2025
  Time: 1:25 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Tu Dien Anh - Viet</title>
</head>
<body>
<h2>Tra tu dien Anh - Viet</h2>
<form action="translate" method="post">
    <label>Nhap tu Tieng Anh: </label>
    <input type="text" name="word" required>
    <button type="submit">Dich</button>
</form>

<c:if test="${not empty word}">
    <h3>
        Kết quả:
        <c:choose>
            <c:when test="${not empty result}">
                ${word} → ${result}
            </c:when>
            <c:otherwise>
                Không tìm thấy từ "${word}" trong từ điển.
            </c:otherwise>
        </c:choose>
    </h3>
</c:if>
</body>
</html>
