package com.psy.action;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.psy.bean.User;
import com.psy.service.UserLoginService;
import com.psy.service.impl.UserLoginServiceImpl;
/**
 * Created by sherry on 16/12/30.
 */
public class UserLoginAction extends ActionSupport implements ModelDriven<User>{

    private User user = new User();
    private UserLoginService userLoginService = new UserLoginServiceImpl();

    public User getModel() {
        return user;
    }
    public String login() throws Exception {

        boolean loginUser = userLoginService.login(user);
        if (loginUser) {
            return "success";
        } else {
            return "login";
        }
    }
}
