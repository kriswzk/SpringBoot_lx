package com.example.springbootmybatis.dao;

import com.example.springbootmybatis.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author WZK
 * @Description
 * @Date 2023/5/6 15:48
 */
@Mapper
public interface UserMapper {
    List<User> userList();
}
