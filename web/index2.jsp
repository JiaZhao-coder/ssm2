<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/10/26
  Time: 12:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%--一般用el都是从域里面取东西,转发那个parmamram不是存到域里的,这是重点--%>
<%--跟后台的serlet那个是存在域里面的,有点区别,所以要这么接收,从所有域搜索 都没得哎--%>
<%= request.getParameter("name")%>
*****************
<%= pageContext.findAttribute("name")%>
</body>
</html>
