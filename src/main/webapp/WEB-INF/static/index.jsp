<%@ page import="java.util.GregorianCalendar" %>
<%@ page import="java.util.Calendar" %><%--
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
    <script src="https://libs.baidu.com/jquery/2.1.4/jquery.min.js"></script>
</head>
<body>
<form action="">
    <div>
        <input id="num" name="num" value="">请输入0-10的数字
    </div>
    <div id="ToF"></div>
    <div id="nowNUm"></div>
    <div>
        <input id="userCode" name="userCode" style="display: none">
    </div>
    <div>
        <input type="button" id="button" value="提交" onclick="updataNum()">
    </div>
</form>
<script>
    get();
    function getCookie(name)
    {
        var arr,reg=new RegExp("(^| )"+name+"=([^;]*)(;|$)");
        if(arr=document.cookie.match(reg))
            return unescape(arr[2]);
        else
            return null;
    }
    function get(){
        $("#userCode").val(getCookie("username"));
    }
</script>
<script>
    function updataNum(){
        let num=$("#num").val();
        if(parseInt(num) > 10){
            alert("请输入10以内的数")
        } else {
            console.log("====");
            $.ajax({
                url:"/Boom",
                type:"POST",
                data:{
                    num:$("#num").val(),
                    userCode:getCookie("username"),
                },
                datatype:"json",
                success: function (data){
                    $("#ToF").text(data.ToF);
                    $("#nowNUm").text("当前数字为"+data.nowNum);
                },
                error: function (){
                    alert("请输入数字");
                }
            })

        }
    }
</script>
</body>
</html>
