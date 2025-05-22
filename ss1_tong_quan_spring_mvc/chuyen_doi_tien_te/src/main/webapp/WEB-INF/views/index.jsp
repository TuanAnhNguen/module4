<%--
  Created by IntelliJ IDEA.
  User: Nitro V
  Date: 5/23/2025
  Time: 12:51 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Chuyen doi tien te</title>
</head>
<body>
<h2>Chuyen Doi Tien Te (USD sang VND)</h2>
<form action="/convert" method="post">
    <label>Ty Gia: </label>
    <input type="number" name="rate" step="0.01" required><br><br>
    <label>So tien USD: </label>
    <input type="number" name="usd" step="0.01" required><br><br>
    <input type="submit" value="Convert">
</form>
</body>
</html>
