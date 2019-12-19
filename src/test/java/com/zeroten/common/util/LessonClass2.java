package com.zeroten.common.util;

import org.testng.annotations.Test;

public class LessonClass2 {
    // 构造器
    // 要使⽤对象，就必须先构造对象，并指定其初始状态。Java 使⽤构造器（constructor）构造新实例。
    // 构造器是⼀种特殊的⽅法，⽤来构造并初始化对象。构造器的名字和类名相同，并且没有返回值。构造器是伴随 new 操作符的执⾏⽽被调⽤。
    // 一个类可以有一个或多个构造器, 他们的名字都和类名相同, 但是参数个数或者类型不一样(这种特征也交重载 overloading).

    private int n1;
    private int n2;
    public LessonClass2(int n1) {
        this();
        this.n1 = n1;
    }
    public LessonClass2(int n1, int n2) {
        this(n1);
        this.n2 = n2;
    }


    // 方法参数
    // java语言总是采用按值调用(call by value), 方法得到的是所有参数的一个拷贝, 方法是不能修改传递给他的任何参数变量的内容.
    //  方法参数总共有2中类型:   1.基本数据类型.    2.对象引用

    private void changePrimitiveValue(int n) {
        n = 200;
    }
    private void changeReferenceValue(StringBuilder sb) {
        sb.append("New");
        sb = new StringBuilder();
        sb.append("NewValue");
    }


    // 类使用的简单操作
    static String className = "创建对象测试";
    static String staticFieldNotSet;
    final static String finalStaticField;
    int index = -1;
    {
        System.out.println("执⾏第⼀个初始化块：" + index);
        index = 1;
        System.out.println(" 赋值后：" + index);
    }
    static {
        System.out.println("执⾏第⼀个静态初始化块");
        finalStaticField = "final 修饰的静态域必须进⾏显式的赋值初始化";
    }
    {
        System.out.println("执⾏第⼆个初始化块：" + index);
        index = 2;
        System.out.println(" 赋值后：" + index);
    }
    static {
        System.out.println("执⾏第⼆个静态初始化块");
    }
    public LessonClass2() {
        System.out.println("执⾏构造器");
        this.index = 3;
        className = "创建对象测试 - 构造器赋值";
    }
    public static void main(String[] args) {
        new LessonClass2();
    }
    {
        System.out.println("执⾏第三个初始化块");
    }
    static {
        System.out.println("执⾏第三个静态初始化块");
    }
    {
        System.out.println("执⾏第四个初始化块");
    }
    static {
        System.out.println("执⾏第四个静态初始化块");
    }

    /**
     * 通过示例执⾏结果，我们可以判断出通过 new 构造⼀个对象时，代码执⾏顺序如下：
     *  1. 按从上到下的顺序执⾏静态域变量的声明以及赋值语句、静态初始化代码块
     *  2.按从上到下的顺序执⾏域变量的声明以及赋值语句、初始化代码块
     *  3.执⾏构造器⽅法
     */

    @Test
    public void testClass() {
        LessonClass2 cs = new LessonClass2(11, 22);
        System.out.println(cs.n1 + cs.n2);
        int n = 100;
        System.out.println(n);
        changePrimitiveValue(n);
        System.out.println(n);
        StringBuilder sb = new StringBuilder();
        sb.append("this is a string.");
        System.out.println(sb.toString());
        changeReferenceValue(sb);
        System.out.println(sb.toString());
    }
    // 什么是重载, 方法签名
    /**
     * 重载: overloading, 只是一个类中可以多个名字相同的方法, 但这些方法的单数个数或者类型不同.
     * 方法签名: 指方法名和参数列表, 而方法的返回值类型不是方法签名的一部分, 一个类中的方法签名必须唯一.
      */

    // 类的构造器方法有哪些特征
    /**
     * 构造器方法名和类型相同, 并且没有返回值(void也不能加).
     * 构造器方法仅仅伴随 new 操作符而被 调用, 不能被继承,覆盖.
     * 类定义时, 如果没有编写构造器方法则系统会提佛坪一个无参的默认构造器.
     * 构造器方法可以被重载.
     */

    // 在类的实例中为什么可以使用this来表示对象自身?
    /**
     * java编译器在编译时会将对象自身当作方法的第一个参数传递, 而方法括号类的参数放在第二个参数及以后.
     * 这个第一个参数我们称为: 隐式参数, 用this表示, 因此我们可以在方法内使用this来当作对象自身.
     */
}
