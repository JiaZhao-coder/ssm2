<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/6/7
  Time: 10:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%--el表达式的配合内置(隐式)对象的使用,el经常和jsp,jstl里面的那些标签配合使用，简化了原来的那三种形式--%>
<form action="${pageContext.request.contextPath}/login" method="post">
    <%--    ${pageContext.request.contextPath}结尾不会带上 /,/SpringMVClearn2_war_exploded--%>
    用户名:<input name="userName" type="text"/> <br/>
    密码:<input name="passWord" type="password"/> <br/>
    <input value="登录" type="submit"><br/>


</form>

<%--<% pageContext.setAttribute("k","v",); %>--%>
<%--<% pageContext.setAttribute(1,2); %>--%>
<%--<% pageContext.setAttribute(); 两个参数的 默认 最小的pageconbtext域 %>--%>

<%--<% pageContext.findAttribute(string name) %>--%>
<%--<% %>--%>
<%--${pageContext.request.contextPath}--%>
<%--${requestScope.key}--%>

<%--${requestScope}--%>

<%--${applicationScope}--%>
</body>
</html>
