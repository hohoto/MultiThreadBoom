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
