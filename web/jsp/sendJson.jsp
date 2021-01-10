<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/6/10
  Time: 17:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="../js/jquery.js"></script>
    <script type="text/javascript">

        function sendJson() {
            //这是一个object对象
            //只要是类似好像不管有没得{}都要帮你所有部分都要标准
            //传json格式的数据到后端 非常重要
            //传过去的最好写上后面的bean类的各个属性,这样就可以直接封装在对象,类里面了
            //这样便于获得,也符合面向对象的思维  spingmvc的有优势直接封装到对象里面取 可以
            var allData = {
                name: "电脑",
                price: 20
            };

            $.ajax(

                {
                    type: "post",//无非就是简化了,且可以不刷新整个页面,局部的发送请求过去
                    url: "${pageContext.request.contextPath}/sendJson.action",
                    contentType: "application/json;charset=utf-8",
                    //  contentType: "application/json;charset=utf-8",这类似表单里面的
                    //哪儿跟entype 说明这是一个json格式数据
                    //JSON.stringify(allData)非常重要
                    //终于懂了，你所写的json，可能有时候格式不对，所以用JSON.stringify帮你整标准
                    //Converts a JavaScript value to a JavaScript Object Notation (JSON) string.
                    //很明显,将前端的javascript对象变成 json格式的字符串,这样后端才好接收
                    data: JSON.stringify(allData),//JSON.stringify(allData)这种是[{}]这种形式
                    // JSON.parse()Converts a JavaScript Object Notation (JSON) string into an object.
                    //相对应的将json对象变为js对象
                    // dataType:"",

                    //就变成了类似{k:v,k2:v2},这只是个json对象 不是json数组
                    //json数组[{k:v,k2:v2},{k:v,k2:v2}]一直往里面加
                    success: function (data) {
                        //成功后促发,这是一个object,因为后端传来的是一个对象
                        //变成json格式的字符串,本质字符串，却是以json的格式{....}
                        //js对象也是object从这里看出
                        console.log(typeof allData);
                        console.log(allData);
                        console.log(typeof JSON.stringify(allData));//变成json格式的字符串,所以
                        //consle 打印的类型shistring
                        console.log(JSON.stringify(allData));
                        //自动帮你把每个k 都加上;分号了,可以 非常重要
                        //后面这俩呢个没有定义,学了就要用
                        console.log(typeof JSON.stringify(allData.field));//相差一个表单哎
                        console.log(JSON.stringify(allData.field));
                        //虽然返回的是object但还是拿得到里面的属性的
                        alert(data);
                        alert(data.name);
                        alert(data.price);
                    }
                }
            )

        }


    </script>


</head>
<body>

<input type="button" value="发送ajax请求" onclick="sendJson()">
</body>
</html>
