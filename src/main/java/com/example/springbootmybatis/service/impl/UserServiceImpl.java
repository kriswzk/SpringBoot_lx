package com.example.springbootmybatis.service.impl;

import com.example.springbootmybatis.dao.UserMapper;
import com.example.springbootmybatis.entity.User;
import com.example.springbootmybatis.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author WZK
 * @Description
 * @Date 2023/5/6 15:47
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public List<User> userList() {
        return userMapper.userList();
    }
}
