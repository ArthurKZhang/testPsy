package com.psy.bean;

/**
 * Created by sherry on 16/12/30.
 */
public class User {
    private String _id;//用户id
    private String name;//用户登录名
    private String password;//用户密码
    private String identity;//用户身份

    public User() {
        super();
    }

    public User(String name, String password, String identity) {
        super();
        this.name = name;
        this.password = password;
        this.identity = identity;
    }
    public User(String _id,String name, String password, String identity) {
        super();
        this._id = _id;
        this.name = name;
        this.password = password;
        this.identity = identity;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", identity='" + identity + '\'' +
                '}';
    }
}
