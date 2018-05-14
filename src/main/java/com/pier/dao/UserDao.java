package com.pier.dao;

import com.pier.bean.User;

/**
 * @auther: zhongweiwu
 * @Description:
 * @Date: 2018/5/14
 */
public interface UserDao {
    User selectByPrimaryKey(int userId);
}
