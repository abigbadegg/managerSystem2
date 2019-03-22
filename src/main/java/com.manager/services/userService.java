package com.manager.services;

import javax.xml.registry.infomodel.User;
import java.util.ArrayList;
import java.util.Map;

public interface userService {
    ArrayList<User> queryUser(Map<String,Object> param);
    Long updateUser(Map<String,Object> params);
    Long insertUser(Map<String,Object> params);
    Long deleteUser(Map<String,Object> params);
}
