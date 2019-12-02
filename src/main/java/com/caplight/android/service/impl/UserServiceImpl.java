package com.caplight.android.service.impl;

import com.caplight.android.dao.UserDao;
import com.caplight.android.entity.User;
import com.caplight.android.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (User)表服务实现类
 *
 * @author makejava
 * @since 2019-11-19 15:26:27
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    @Override
    public User findByNameAndPass(User user) {
        return userDao.findByNameAndPass(user);
    }

    @Override
    public User findAll() {
        return userDao.findAll();
    }
}