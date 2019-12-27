package com.zeroten.common.util.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

// cglib 代理
public class CglibProxy implements MethodInterceptor {
    private Object target;
    public CglibProxy(Object target) {
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
            System.out.println("姓名 为空，不保存");
            return false;
        }
        if (user.getAge() == null || user.getAge() < 0 || user.getAge() > 200) {
            System.out.println("年龄 不在有效范围 0~200 内，不保存");
            return false;
        }

        return true;
    }
    public Object getProxyInstance() {
        Enhancer en = new Enhancer();
        en.setSuperclass(target.getClass());
        en.setCallback(this);
        return en.create();
    }
    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        if (checkSaveUserParam(method.getName(), args)) {
            return method.invoke(target, args);
        }
        return null;
    }
}
