//点击事件
function mylogin(){
    var user = new Object();
    user.role = $("input[name='role']").val();
    user.name = $("input[name='name']").val();
    user.password = $("input[name='password']").val();
    user.id = 1;

    //信息校验
    if(user.role != 1 && user.role != 2){
        alert("请选择登录身份");
        return;
    }
    if(user.name == null || user.name.length < 2 || user.name.length > 16){
        alert("请规范填写名称,长度在2到12位之间");
        return;
    }
    if(user.password == null || user.password.length < 3 || user.password.length > 16){
        alert("请规范填写密码，长度在6到12位之间");
        return;
    }

    //检查是否存在该用户
    var isUser = getUser(user);
}

//检查是否存在该用户 com.manager.controller.
function getUser(user){
    $.post("./userController/getUser.do",user,function(result,state){
        if(result > 0){
            alert("登录成功！！！");
        }else{
            alert("账号或密码错误！！！");
        }
    });
}

function myRegister(){

}