<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: chumeng
  Date: 2022/7/11
  Time: 10:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>hello</h1>
<c:forEach items="${list}" var="emp">
    ${emp}<br>
</c:forEach>

<table border="1">
    <tr>
        <td>empno</td>
        <td>ename</td>
        <td>job</td>
        <td>mgr</td>
        <td>hiresdate</td>
        <td>sal</td>
        <td>deptno</td>
        <td>comm</td>
    </tr>
    <c:forEach items="${list}" var="emp">
        <tr>
            <td>${emp.empno}</td>
            <td>${emp.ename}</td>
            <td>${emp.job}</td>
            <td>${emp.mgr}</td>
            <td>${emp.hiresdate}</td>
            <td>${emp.sal}</td>
            <td>${emp.deptno}</td>
            <td>${emp.comm}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
