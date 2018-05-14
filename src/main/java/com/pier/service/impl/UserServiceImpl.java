package com.pier.service.impl;

import com.pier.bean.User;
import com.pier.dao.UserDao;
import com.pier.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @auther: zhongweiwu
 * @Description:
 * @Date: 2018/5/14
 */
@Service
public class UserServiceImpl implements UserService{

    @Resource
    private UserDao userDao;

    public User getUserById(int userId) {
        return userDao.selectByPrimaryKey(userId);
    }
}
