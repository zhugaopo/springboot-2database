package com.sunyard.bigdata.dao;

import com.sunyard.bigdata.pojo.User;

import java.util.List;

public interface UserMapper {

    User queryById(int id);

    List<User> queryAll();

    int add(User user);

    int delById(int id);

    int updateById(User user);
}
