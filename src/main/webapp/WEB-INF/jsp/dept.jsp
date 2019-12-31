<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/2
  Time: 10:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>springmvc</title>
   <!--
       page
     // request.setAttrbute("myParam",1); 一次请求
      //session.setAttrbute("myParam",2);  一次回话
      ServletContext.setAttrbute("myParam",3); servlet  -- 整个项目
      application.setAttrbute("myParam",3); jsp
    --!>
</head>
<body>
       ${myParam}  <%-- ${} 先去requestScope  再去sessionScope   --%>
</body>
</html>
