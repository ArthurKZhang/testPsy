package com.psy.dao.impl;
import com.mongodb.*;
import com.psy.dao.MongoDB;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by sherry on 16/12/30.
 */
public class MongoDBImpl implements MongoDB{


    //1、连接到数据库
    public MongoClient getMongo(){
        //1、连接到MongoDB数据库
        MongoClient mongo=new MongoClient("localhost",27017);
        return mongo;
    }

    //2、获取指定数据库
    public DB getDb(String DbName){
        MongoClient mongo=getMongo();
        return mongo.getDB(DbName);
    }

    //3、显示数据库中所有数据库
    public void showDb(){
        MongoClient mongo=getMongo();
        //显示所有数据库
        List<String> dbs=mongo.getDatabaseNames();
        for(String database:dbs){
            System.out.println(database);
        }

    }
    //4、获取一个表
    public DBCollection getTable(DB db,String tableName){
        //如果表不存在，MongoDB将会创建一个
        DBCollection table=db.getCollection(tableName);
        return table;
    }

    //5、显示数据库中所有表
    public void showTables(DB db){
        //显示选择的数据库中所有表
        Set<String> tables=db.getCollectionNames();
        for(String coll:tables){
            System.out.println(coll);
        }
    }

    //6、新增一条记录
    public void insert(Map<String,Object> map,DBCollection table){
        BasicDBObject document=new BasicDBObject();
        for(Object key:map.keySet()){
            document.put((String) key, map.get(key));
        }
        table.insert(document);
    }

    //7、查找并显示一条记录
    public void search(BasicDBObject basicDBObject,DBCollection table){
        DBCursor dbCursor=table.find(basicDBObject);
        while(dbCursor.hasNext()){
            System.out.println(dbCursor.next());
        }
        System.out.println("End");
    }


    //8、更新一条记录
    public void update(BasicDBObject query,BasicDBObject newDocument,
                       DBCollection table){
        BasicDBObject updateObj=new BasicDBObject();
        updateObj.put("$set",newDocument);
        table.update(query, updateObj);
    }
    //9、删除一条记录
    public void delete(BasicDBObject basicDBObject,DBCollection table){
        table.remove(basicDBObject);
    }


    //查找并返回字符串(password)
    public String searchPasswd(BasicDBObject basicDBObject,
                               DBCollection table,String string){
        DBCursor dbCursor=table.find(basicDBObject);
        while(dbCursor.hasNext()) {
            String repassword = (String) dbCursor.next().get(string);
            // System.out.println(repassword);
            return repassword;
        }
        return null;
    }


    //根据姓名密码，查找并返回字符串(ExistName)
    public boolean check(BasicDBObject cond,
                         DBCollection table){
        DBCursor dbCursor=table.find(cond);
        if(!dbCursor.hasNext()) {
            return false;
        }
        return true;
    }

    //注册新用户到数据库（name,password,identity）
    public boolean register(BasicDBObject obj,
                         DBCollection table){
        table.insert(obj);
        return true;
    }
}
