package com.psy.dao;
import com.mongodb.*;
import java.util.List;
import java.util.Map;
import java.util.Set;
/**
 * Created by sherry on 16/12/30.
 */
public interface MongoDB {

    //1、连接到数据库
    public MongoClient getMongo();

    //2、获取指定数据库
    public DB getDb(String DbName);

    //3、显示数据库中所有数据库
    public void showDb();
    //4、获取一个表
    public DBCollection getTable(DB db, String tableName);

    //5、显示数据库中所有表
    public void showTables(DB db);

    //6、新增一条记录
    public void insert(Map<String, Object> map, DBCollection table);

    //7、查找并显示一条记录
    public void search(BasicDBObject basicDBObject, DBCollection table);


    //8、更新一条记录
    public void update(BasicDBObject query, BasicDBObject newDocument,
                       DBCollection table);
    //9、删除一条记录
    public void delete(BasicDBObject basicDBObject, DBCollection table);

    //查找并返回字符串(password)
    public String searchPasswd(BasicDBObject basicDBObject,
                               DBCollection table, String string);

    public boolean check(BasicDBObject cond,
                         DBCollection table);

    public boolean register(BasicDBObject obj,
                            DBCollection table);
}
