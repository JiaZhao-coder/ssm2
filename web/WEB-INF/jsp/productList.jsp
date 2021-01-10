<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/5/24
  Time: 17:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%--引入taglib是为了可以使用jstll标签--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>查询商品列表</title>
</head>

<body>

<form action="${pageContext.request.contextPath}/queryitem.action" method="post">

    <%--    form里面两个table就是原生的有点不好看--%>
    查询条件:
    <table width="100%" border="1">
        <%--        tr是一行，td是一行里面有几个--%>
        <tr>
            <td>
                <%--                product.name这么写是为了后面好封装,主要还是product，user的作用,在才是里面的属性--%>
                <%--               像我们一般写就是name="product",这样是封装不进去的，输入的是字符串--%>
                商品名称:<input type="text" name="product.name">
                <%--                    name="product.name"这个把查询条件传过去,不太懂--%>
                商品价格:<input type="text" name="product.price">
                姓名:<input type="text" name="user.user_name">
                性别:<input type="text" name="user.user_sex">

            </td>
            <%--            这个type：submit还是有用--%>
            <td>
                <input type="submit" value="查询"/>
            </td>
        </tr>

    </table>

    商品列表:
    <table width="100%" border="1">
        <tr>
            <td>商品名称</td>
            <td>商品价格</td>
            <td>商品描述</td>
            <td>操作</td>
        </tr>
        <%--        c标签写这里是对的--%>
<%--        productList这里只是专门写出来了接收,好理解--%>
        <c:forEach items="${productList}" var="item" >
            <tr>
                <td>${item.name}</td>
                <td>${item.price}</td>
                <td>${item.detail}</td>
                <td>
                        <%--      el就是快 简化了              现在看这些豁然开朗，都明白其中的原理--%>
<%--                    虽然拼接了,但的url还是主要的,拼接的再多也找得到--%>
                    <a href="${pageContext.request.contextPath}/itemEdit.action?id=${item.id}"
                       target="_blank">
                        修改</a>
                </td>


            </tr>


        </c:forEach>

    </table>

</form>

</body>
</html>
