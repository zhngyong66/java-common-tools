package com.zeroten.common.util.proxy;

public class User {
    /**
     * 代理是java SE 1.3新增的一种特性, 利用代理可以在运行创建一个实现了一组给定的接口的新类, 通过代理类实现对目标类的调用
     * 代理是一种设计模式, 它可以在目标对象的基础上, 增加一些额外的功能, 扩展目标对象的功能而不用修改已经存在的代码.
     * 代理主要有3种方式来实现:
     *  1.静态代理
     *  2.动态代理
     *  3.Cglib代理
     */
    // 1.静态代理
    /**
     * 缺点:
     *  1.代理对象和目标对象需要实现一样的接口或继承自相同父类, 这样会存在很多代理类.
     *  2.一旦接口或父类增减了方法, 那么代理和目标对象都要做相应的修改
     */
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        StringBuilder tmp = new StringBuilder();
        tmp.append("姓名: ");
        if (name != null && name.length() > 0) {
            tmp.append(name);
        }
        tmp.append(",");
        tmp.append("年龄: ");
        if (age != null) {
            tmp.append(age);
        }
        return tmp.toString();
    }

    // 2.动态代理
    /**
     * 动态代理是JDK提供的一个特性, 被代理的对象必须实现一组接口. 创建代理类需要用到JDK提供的 Proxy.newProxyInstance 方法.
     *
     */

    // 3.cglib
    /**
     * 对于没有实现任何接口的类, 我们需要对其进行代理时, 可以使用 cglib 等开源方案来实现
     * cglib 通过在内存中建立一个子类对象从而实现对目标对象的代理扩展, 我们也可以称为是子类代理. cglib代理有以下特征:
     *  1. cglib是一个强大的高性能代码生成包, 它在运行时扩展java类或实现java接口, 他被广发用于支持APO的一些框架(如: Spring AOP), 提供方法的拦截(interception)
     *  2. cglib底层通过使用字节处理框架ASM来转换字节码并生成新的类.
     *  3.被代理的类不能声明为final.
     *  4.目标对象的方法如果声明为 final 或 static, 则不会被拦截.
     *  5.Spring包中已经包含 cglib 的功能. 在 Spring AOP 中, 如果被代理对象是基于接口实现的, 则使用JDK 代理; 否则用 cglib 代理.
     */
}
