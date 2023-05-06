package com.example.springbootmybatis.service;

import com.example.springbootmybatis.entity.User;

import java.util.List;

/**
 * @Author WZK
 * @Description
 * @Date 2023/5/6 15:45
 */
public interface UserService {

    List<User> userList();
}
