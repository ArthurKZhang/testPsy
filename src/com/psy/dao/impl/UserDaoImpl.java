package com.psy.dao.impl;
import com.psy.bean.User;
import com.psy.dao.MongoDB;
import com.mongodb.*;
import com.psy.dao.UserDao;

/**
 * Created by sherry on 16/12/30.
 */
public class UserDaoImpl implements UserDao{

    public boolean check(User user) {

        MongoDB mongo = new MongoDBImpl();
        mongo.getMongo();
        DB userdb =mongo.getDb("user");
        DBCollection userTable = mongo.getTable(userdb,"user");

        BasicDBObject cond = new BasicDBObject();
        cond.put("name",user.getName());
        cond.put("password",user.getPassword());

        //比对数据库返回数据库中的密码
        String ExistName = mongo.searchPasswd(cond,userTable,"name");
        if (ExistName != null) {
            return true;
        } else {
            return false;
        }
    }

    public boolean register(User user){
        MongoDB mongo = new MongoDBImpl();
        mongo.getMongo();
        DB userdb =mongo.getDb("user");
        DBCollection userTable = mongo.getTable(userdb,"user");

        BasicDBObject obj = new BasicDBObject();
        obj.put("name",user.getName());
        obj.put("password",user.getPassword());
        obj.put("identity",user.getIdentity());

        //返回数据库注册结果
        boolean result = mongo.register(obj,userTable);
        if (result) {
            return true;
        } else {
            return false;
        }
    }

}
