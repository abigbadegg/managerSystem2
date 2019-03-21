package com.manager.controller;

import com.manager.services.userService;
import com.sun.mail.iap.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.json.JsonObject;
import javax.servlet.http.HttpServletResponse;
import javax.xml.registry.infomodel.User;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;

@Controller
@RequestMapping(value = "/userController",method = RequestMethod.POST)
public class userController {

    @Autowired
    userService userService;

    @ResponseBody
    @RequestMapping(value = "/getUser",method = RequestMethod.POST)
    public Long getUser(@RequestParam Map<String,Object> param){
        System.out.println("登录账号检查！");
        ArrayList<User> userList = userService.queryUser(param);

        return Long.valueOf(userList.size());
    }
}
