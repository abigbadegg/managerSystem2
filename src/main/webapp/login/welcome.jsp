<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019-03-20
  Time: 11:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>请登录</title>
</head>
<body>
    <div id="body">
        <div id="title"></div>
        <div id="formlist">
            用户<input type="radio" id="role1" name="role" value="1" checked/>
            员工<input type="radio" id="role2" name="role" value="=2"/><br>
            昵称<input type="text" id="name" name="name"/><br>
            密码<input type="password" id="password" name="password"/><br>
            <input type="button" id="submit" name="submit" value="登录"/>
            <input type="button" id="login" name="login" value="注册"/>
        </div>
    </div>
</body>
</html>
