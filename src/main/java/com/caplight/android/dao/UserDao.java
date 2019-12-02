package com.caplight.android.dao;

import com.caplight.android.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * (User)表数据库访问层
 *
 * @author makejava
 * @since 2019-11-19 15:26:27
 */
@Mapper
public interface UserDao {

    @Select("select * from user where userName=${userName} and passWord=${passWord}")
    User findByNameAndPass(User user);

    @Select("select * from user")
    User findAll();
}