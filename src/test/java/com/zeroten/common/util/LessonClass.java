package com.zeroten.common.util;

public class LessonClass {

    // 类是构造对象的模板或者蓝图, 它定义了一类对象的状态和行为, 从形式来看是将数据和行为封装放在一个类里.
    //  类中的数据成为实例域(instance field), 操作数据的过程成为方法(method).

    // 对象是类的一个实例, 有状态和行为,每个类实例(对象)都有一组特定的实例域值, 这些值的集合就是这个对象的当前的状态(state).

    // 类变量 or 静态变量 or 静态域
    private static String classField;
    // 实例变量
    private String field;
    // 实例代码块
    {
        field = "实例变量";
    }
    // 静态代码块
    static {
        classField = "类变量";
    }
    // 构造方法
    public LessonClass() {}
    // 方法
    public void method() {
        // 局部变量
        int i = 0;
    }

    // 内部类
    public class Person {
        private String name;
        protected String sex;
        String age;
        public String height;

        public void walking() {
            System.out.println("hello, class!");
        }
    }
}
