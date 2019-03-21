package com.manager.services.impl;

import com.manager.dao.userDao;
import com.manager.services.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.registry.infomodel.User;
import java.util.ArrayList;
import java.util.Map;

@Service("stPlanTemplateServ")
public class userServiceImpl implements userService {
    @Autowired
    userDao userDao;

    public ArrayList<User> queryUser(Map<String,Object> param){
        ArrayList<User> userList = new ArrayList<>();
        userList  = userDao.queryUser(param);
        return userList;
    }
}
