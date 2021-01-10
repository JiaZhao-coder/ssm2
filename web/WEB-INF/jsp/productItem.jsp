<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/6/7
  Time: 18:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--enctype="multipart/form-data"很关键--%>
<%--表单最好里面的每个标签写上name,便于后端接收,enctype="multipart/form-data"这种即可传文件,又可以传文本数据--%>
<%--文件上传,表单里必须时post的方式,非常重要--%>
<form action="${pageContext.request.contextPath}/updateitem.action" method="post" enctype="multipart/form-data">

    <%--       item这里虽然没专门写出来了,没拿一个变量接收,但确实后端发过来了,直接取出来即可,好理解--%>
    <%--        items="${productList}" 不像这个直接就拿一个变量接收了,一样的效果--%>
    <%--        难怪表单这么常用,因为他又没上面形式,但它里面的那些input的各种类型,加上type=sumbit这个属性就非常实用了--%>
    <input type="hidden" name="id" value="${item.id}"/>修改商品信息
    <%--        这个id怎么说哎,最先从数据库来的,然后通过上个页面传到这的,也避免了再次区请求服务器的压力--%>
    <%--        隐藏域有意思,1.没有占用空间,2.可以将一些额外的信息,发给后端--%>
    <input type="hidden" name="img" value="${item.img}"/>

    <table width="100%" border="1">

        <tr>
            <%--            很明显td行级标签,tr块级标签  wiedth 50%各分 一半--%>
            <td width="50%">商品名称:</td>
            <td width="50%"><input type="text" name="name" value="${item.name}"></td>
        </tr>


        <tr>
            <td width="50%">商品价格:</td>
            <td width="50%"><input type="text" name="price" value="${item.price}"></td>
        </tr>


        <tr>
            <td width="50%">商品描述:</td>
            <%--            el表达式,在jsp里面非常强,后端如果传来的是对象(对象里面有属性),直接object.key.key这样下去,取出来--%>
            <td><input type="text" name="detail" value="${item.detail}"></td>
        </tr>


        <tr>
            <td width="50%">商品图片:</td>

            <td>
                <%--    好像if test里面可以这么写，el里面可以写表达式--%>
                <%--   ，el就是要这样配合表达式和标签一起使用,还判了个空--%>
                <c:if test="${item.img!=null&&item.img!=''}">
                    <%--                    因为这个是动态的请求的,数据库里面的图片的名字变了,又正因为它是从数据库实时取出来的,所以是动态的--%>
                    <%--                    虽然没有更新到web下面,但部署编译后的路径里面的那个目录是已经上传到那里去了--%>
                    <img id="img1" src="${pageContext.request.contextPath}/images/${item.img}" width="100"
                         height="100"/>
                </c:if>
                <%--                    更改图片:<input type="file" name="fileUpload"/> 最好异步ajax--%>
                <%--                <a onclick="">修改图片</a>--%>

            </td>

        </tr>


        <tr>
            <td width="50%">上传文件:</td>
            <%--            难怪上传文件写在表单,因为其它的,不管是ajax,还是其它,都需要借助类似表单这种才能--%>
            <td width="100" height="100"><input type="file" name="fileUpload2"/></td>
        </tr>


        <tr>
            <td colspan="2" align="center">
                <input type="submit" value="修改">
            </td>
        </tr>


    </table>


</form>

<%--<script>--%>

<%--    function changeImage() {--%>
<%--        var img1 = document.getElementById("img1");--%>
<%--        img1.src = ""--%>


<%--    }--%>


<%--</script>--%>

</body>
</html>
