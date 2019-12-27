package com.zeroten.common.util.proxy;

// 静态代理:
public class UserDaoProxy implements UserDao {
    private UserDao target;
    public UserDaoProxy(UserDao dao) {
        target = dao;
    }
    @Override
    public void save(User user) {
        if (user.getName() == null || user.getName().length() == 0) {
            System.out.println("name 为空, 不保存!");
            return;
        }
        if (user.getAge() == null || user.getAge() < 0 || user.getAge() > 200) {
            System.out.println("年龄不在有效范围内, 不保存!");
            return;
        }
        target.save(user);
    }
}
