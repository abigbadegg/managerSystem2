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
import java.util.*;

@Controller
@RequestMapping(value = "/userController",method = RequestMethod.POST)
public class userController {

    @Autowired
    userService userService;

    @ResponseBody
    @RequestMapping(value = "/getUser",method = RequestMethod.POST)
    public Long getUser(@RequestParam Map<String,Object> param){
        System.out.println("账号检查！");
        ArrayList<User> userList = userService.queryUser(param);

        return Long.valueOf(userList.size());
    }

    @ResponseBody
    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    public Long addUser(@RequestParam Map<String,Object> param){
        System.out.println("登录账号检查！");

        Map<String,Object> name = new HashMap<>();
        name.put("name",param.get("name"));
        ArrayList<User> userList = userService.queryUser(name);

        //1成功，2用户名已存在
        Long result = 1l;
        if(userList.size() != 0){
            result = 2l;
            return result;
        }
        Long resultInsert = userService.insertUser(param);
        return result;
    }
}
