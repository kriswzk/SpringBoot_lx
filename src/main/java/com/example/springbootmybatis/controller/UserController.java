package com.example.springbootmybatis.controller;

import com.example.springbootmybatis.entity.User;
import com.example.springbootmybatis.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author WZK
 * @Description
 * @Date 2023/5/6 15:41
 */
@RestController
public class UserController {
    @Resource
    private UserService userService;
    @PostMapping("/UserSelect")
    public List<User> UserSelect(){
        return userService.userList();
    }
}
