//点击事件
function mylogin(){
    var user = new Object();
    user.role = $("input[name='role']").val();
    user.name = $("input[name='name']").val();
    user.password = $("input[name='password']").val();

    //信息校验
    var res = checkInfo(user);
    //检查是否存在该用户
    if(res == true) {
        getUser(user, function (result) {
            if (result > 0) {
                window.location.href = "firstPage.html";
            } else {
                alert("账号或密码错误！！！");
            }
        });
    }

}

function myRegister(){
    var user = new Object();
    user.role = $("input[name='role']").val();
    user.name = $("input[name='name']").val();
    user.password = $("input[name='password']").val();

    //信息校验
    checkInfo(user);
    addUser(user,function(result){
        if (result == 1) {
            window.location.href="firstPage.html";

        }else{
            alert("登录失败");
        }
    });

}

function checkInfo(user){
    var res = true;
    if(user.role != 1 && user.role != 2){
        alert("请选择登录身份");
        res = false;
    }
    if(user.name == null || user.name.length < 2 || user.name.length > 16){
        alert("请规范填写名称,长度在2到12位之间");
        res = false;
    }
    if(user.password == null || user.password.length < 3 || user.password.length > 16){
        alert("请规范填写密码，长度在3到12位之间");
        res = false;
    }
    return res;
}

//检查是否存在该用户 com.manager.controller.
function getUser(user,callback){
    $.post("../../userController/getUser.do",user,callback);
}

function addUser(user,callback){
    $.post("../../userController/addUser.do",user,callback);
}