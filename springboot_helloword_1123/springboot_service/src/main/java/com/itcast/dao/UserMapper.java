package com.itcast.dao;

import com.itcast.pojo.User;


import org.apache.ibatis.annotations.Param;

import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;


import java.util.List;


public interface UserMapper extends Mapper<User> {
    List<User> findAll();

    User findById(@Param(value = "id") int id);

    @Select("select * from user where id=#{id}")
    User selectId(@Param(value = "id") int id);
}
