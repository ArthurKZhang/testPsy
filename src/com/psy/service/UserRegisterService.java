package com.psy.service;
import com.psy.bean.User;
/**
 * Created by sherry on 17/1/18.
 */
public interface UserRegisterService {
    /**
     * 用户注册功能
     * @param user
     * @return
     * @throws Exception
     */
    public boolean register(User user) throws Exception;
}
