<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/2
  Time: 11:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>部门列表1</title>
</head>
<body>
    <img src="<%=request.getContextPath()%>/imgs/bd_logo1.png">
    <h3>部门列表1</h3>
    <c:forEach items="${deptList}" var="dept">
        ${dept.deptNo}-${dept.dname}-${dept.loc}<br>
    </c:forEach>

</body>
</html>
