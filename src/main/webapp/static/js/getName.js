function setCookie(name,value) {
    var Days = 1;
    var exp = new Date();
    exp.setTime(exp.getTime() + Days*24*60*60*30);
    document.cookie = name + "=" + escape (value) + ";expires=" + exp.toGMTString();;
}

    function set(){
    console.log($("#username").val());
    setCookie("username",$("#username").val());
}
