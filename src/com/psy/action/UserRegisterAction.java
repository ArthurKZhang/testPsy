package com.psy.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.psy.bean.User;
import com.psy.service.UserLoginService;
import com.psy.service.UserRegisterService;
import com.psy.service.impl.UserLoginServiceImpl;
import com.psy.service.impl.UserRegisterServiceImpl;

/**
 * Created by sherry on 17/1/18.
 */
public class UserRegisterAction extends ActionSupport implements ModelDriven<User> {
    private User user = new User();
    private UserRegisterService userRegisterService = new UserRegisterServiceImpl();

    public User getModel() {
        return user;
    }
    public String register() throws Exception {

        boolean registerUser = userRegisterService.register(user);
        if (registerUser) {
            return "success";
        } else {
            return "register";
        }
    }
}
