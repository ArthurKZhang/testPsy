package com.psy.service;
import com.psy.bean.User;
/**
 * Created by sherry on 16/12/30.
 */
public interface UserLoginService {
    /**
     * 用户登录功能
     * @param user
     * @return
     * @throws Exception
     */
    public boolean login(User user) throws Exception;
}
