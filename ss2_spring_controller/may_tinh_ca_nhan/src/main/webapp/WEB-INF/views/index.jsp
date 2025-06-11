<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>May tinh ca nhan</title>
</head>
<body>
<h1>May tinh ca nhan</h1>
<form action="/calculate" method="post">
    <input type="text" name="num1" value="${num1 != null ? num1 : ''}"/>
    <input type="text" name="num2" value="${num2 != null ? num2 : ''}"/><br><br>

    <button type="submit" name="operator" value="cong">Cong(+)</button>
    <button type="submit" name="operator" value="tru">Tru(-)</button>
    <button type="submit" name="operator" value="nhan">Nhan(*)</button>
    <button type="submit" name="operator" value="chia">Chia(/)</button>

</form>

<c:if test="${not empty error}">
    <p>${error}</p>
</c:if>

<c:if test="${not empty result}">
    <p>Result ${operation} : ${result}</p>
</c:if>
</body>
</html>
