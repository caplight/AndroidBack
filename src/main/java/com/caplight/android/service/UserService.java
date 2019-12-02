package com.caplight.android.service;

import com.caplight.android.entity.User;

/**
 * (User)表服务接口
 *
 * @author makejava
 * @since 2019-11-19 15:26:27
 */
public interface UserService {


    User findByNameAndPass(User user);

    User findAll();
}