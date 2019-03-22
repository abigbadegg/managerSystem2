package com.manager.dao;

import javax.xml.registry.infomodel.User;
import java.util.ArrayList;
import java.util.Map;

public interface userDao {
    ArrayList<User> queryUser(Map<String,Object> params);
    Long updateUser(Map<String,Object> params);
    Long insertUser(Map<String,Object> params);
    Long deleteUser(Map<String,Object> params);
}
