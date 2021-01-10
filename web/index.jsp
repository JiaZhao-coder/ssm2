<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/10/22
  Time: 20:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<%--    看清楚这是param不是存到那个域里面,类似url拼接?这种,所以取就要提供getparam()这种才能--%>
<jsp:forward page="./index2.jsp">
    <jsp:param name="name" value="zhangsan"/>
</jsp:forward>
</body>
</html>
