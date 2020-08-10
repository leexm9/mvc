<%--
  Created by IntelliJ IDEA.
  User: My
  Date: 2020/8/5
  Time: 9:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>show demo</title>
    <c:forEach items="${stus}" var="student">
        <c:out value="${student.name}"/>&nbsp;&nbsp;
        <c:out value="${student.age}"/>&nbsp;&nbsp;
        <c:out value="${student.teacher}"/><br/>
    </c:forEach>
</head>
<body>

</body>
</html>
