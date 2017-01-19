package com.psy.service.impl;

import com.psy.bean.User;
import com.psy.dao.UserDao;
import com.psy.dao.impl.UserDaoImpl;
import com.psy.service.UserRegisterService;

/**
 * Created by sherry on 17/1/18.
 */
public class UserRegisterServiceImpl implements UserRegisterService{

    private UserDao userDao = new UserDaoImpl();

    public boolean register(User user) throws Exception {
        return userDao.register(user);
    }
}
