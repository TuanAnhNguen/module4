<%--
  Created by IntelliJ IDEA.
  User: Nitro V
  Date: 6/24/2025
  Time: 2:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Settings Result</title>
    <meta charset="UTF-8">
</head>
<body>
<h2>Settings Updated</h2>

<p><strong>Language:</strong> <c:out value="${setting.language}"/></p>
<p><strong>Page Size:</strong> <c:out value="${setting.pageSize}"/></p>
<p><strong>Spam Filter Enable:</strong> <c:out value="${setting.spamFilterEnable}"/></p>
<p><strong>Signature:</strong></p>
<pre><c:out value="${setting.signature}"/></pre>

<a href="/">Back to Setting</a>
</body>
</html>
