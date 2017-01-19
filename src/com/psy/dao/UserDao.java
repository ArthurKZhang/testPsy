package com.psy.dao;

import com.psy.bean.User;

/**
 * Created by sherry on 16/12/30.
 */
public interface UserDao {

    public boolean check(User user);
    public boolean register(User user);
}
