<%--
  Created by IntelliJ IDEA.
  User: guo13
  Date: 2020/10/9
  Time: 17:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>多线程数字炸弹</title>
    <script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
</head>
<body>
<form action="">
    <div>
        <input id="num" name="num" value="">请输入10到150的数字
    </div>
    <div>
        <input id="userCode" name="userCode" style="display: none">
    </div>
    <div>
        <input type="submit" id="button" value="提交">
    </div>
</form>
<div>
    ${ToF}
</div>
<script>
    function getCookie(name)
    {
        var arr,reg=new RegExp("(^| )"+name+"=([^;]*)(;|$)");
        if(arr=document.cookie.match(reg))
            return unescape(arr[2]);
        else
            return null;
    }
</script>
<script>
    get();
    function get(){
        $("#userCode").val(getCookie("username"));
    }
</script>
</body>
</html>
