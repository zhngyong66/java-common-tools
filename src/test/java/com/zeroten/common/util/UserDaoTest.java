package com.zeroten.common.util;

import com.zeroten.common.util.proxy.*;

import java.lang.reflect.Proxy;

public class UserDaoTest {
    public static void main(String[] args) {
        User user = new User();
        user.setName("张三");
        user.setAge(20);

        // 非代理情况下
//        UserDao dao = new UserDaoImpl();
//        dao.save(user);

        //静态代理方法
//        UserDao dao = new UserDaoImpl();
//        UserDaoProxy proxy = new UserDaoProxy(dao);
//        proxy.save(user);

        // 动态代理: 动态代理是JDK提供一个特性, 因此也成为JDK代理.
//        UserDao dao = new UserDaoImpl();
//        ClassLoader classLoader = dao.getClass().getClassLoader();
//        Class[] interfaces = dao.getClass().getInterfaces();
//        CheckHandler handler = new CheckHandler(dao);
//        UserDao proxy = (UserDao) Proxy.newProxyInstance(classLoader, interfaces, handler);
//        proxy.save(user);

        // cglib 代理
        UserDao dao = new UserDaoImpl();
        UserDao proxy = (UserDao) new CglibProxy(dao).getProxyInstance();
        proxy.save(user);
    }
}
