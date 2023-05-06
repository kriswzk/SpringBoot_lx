package com.example.springbootmybatis.entity;

import lombok.Data;
import org.apache.ibatis.type.Alias;

/**
 * @Author WZK
 * @Description
 * @Date 2023/5/6 15:42
 */
@Data
@Alias("User")
public class User {
    private Integer id;
    private String Name;
    private String password;
}
