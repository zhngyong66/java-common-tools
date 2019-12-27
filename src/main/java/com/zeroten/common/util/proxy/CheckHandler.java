package com.zeroten.common.util.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

// 动态代理:
public class CheckHandler implements InvocationHandler {
    private Object target;
    public CheckHandler(Object target) {
        this.target = target;
    }

    private boolean checkSaveUserParam(String methodName, Object[] args) {
        if (!(target instanceof UserDao)) {
            return true;
        }
        if (!"save".equals(methodName)){
            return true;
        }
        if (args == null || args.length < 1 || !(args[0] instanceof User)){
            return true;
        }
        User user = (User) args[0];
        if (user.getName() == null || user.getName().length() == 0) {
            System.out.println("name为空, 不保存!");
            return false;
        }
        if (user.getAge() == null ||user.getAge() < 0 || user.getAge() > 200) {
            System.out.println("age 不在有效范围 0~200 内, 不保存!");
            return false;
        }
        return true;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (checkSaveUserParam(method.getName(), args)) {
            return method.invoke(target, args);
        }
        return null;
    }
}
