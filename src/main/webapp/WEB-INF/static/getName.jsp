<%--
  Created by IntelliJ IDEA.
  User: guo13
  Date: 2020/10/10
  Time: 16:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>玩家代码</title>
    <script src="https://libs.baidu.com/jquery/2.1.4/jquery.min.js"></script>
</head>
<body>
<form action="index" method="post">
    <div align="center">
        <input id = "username" name = "username" value="">请输入玩家代码
    </div>
    <div align="center">
        <input type="submit" value="游戏开始" onclick="set()">
    </div>
</form>
<script type="text/javascript">
    function setCookie(name,value) {
        var Days = 1;
        var exp = new Date();
        exp.setTime(exp.getTime() + Days*24*60*60*30);
        document.cookie = name + "=" + escape (value) + ";expires=" + exp.toGMTString();;
    }
</script>
<script type="text/javascript">
    function set(){
        console.log($("#username").val());
        setCookie("username",$("#username").val());
    }
</script>
</body>
</html>
