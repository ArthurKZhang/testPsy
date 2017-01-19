package com.psy.service.impl;
import com.psy.bean.User;
import com.psy.service.UserLoginService;
import com.psy.dao.UserDao;
import com.psy.dao.impl.UserDaoImpl;
/**
 * Created by sherry on 16/12/30.
 */
public class UserLoginServiceImpl implements UserLoginService{

    private UserDao userDao = new UserDaoImpl();

    public boolean login(User user) throws Exception {

        return userDao.check(user);
    }
}
