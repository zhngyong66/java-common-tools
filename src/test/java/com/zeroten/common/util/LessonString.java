package com.zeroten.common.util;

import org.testng.annotations.Test;

public class LessonString {

    /*
        java字符串就是Unicode字符序列.
        java没有内置的字符类型, 而是在标准java类库中提供了一个预定义的类String.
        每个双引号括起来的字符串都是String类的一个实例.
        可以直接赋值或者new操作符来创建字符串.
    */


    @Test
    public void stringTest() {
        // 常见的集中创建String实例
        String str1 = "aaa";
        String str2 = "hello";
        String str3 = new String("create string with new");
        String str4 = str2;
        System.out.println("str1-->" + str1);
        System.out.println("str2-->" + str2);
        System.out.println("str3-->" + str3);
        System.out.println("str4-->" + str4);
        System.out.println("str4 = str2" + (str4 == str2));
    }

    //String 类没有提供⽤于修改字符串的⽅法，所以我们将 String 类对象称为不可变字符串，它被声明为 final class，所有的属性也被定义为 final 的。但是我们可以修改字符串变量，让它指向另外⼀个字符串。
    //为了提⾼内存利⽤率，JVM 有⼀个字符串常量池，每次使⽤双引号定义字符串，JVM 会先到该常量池中来检测是否已经存在，存在则直接该对象的引⽤；否则在常量池中创建⼀个新增并返回该值的引⽤。
    //使⽤ new 创建字符串（ new String("字符串"); ）时，会直接在堆中创建该字符串并返回其引⽤。从 Java 6 开始，String 类提供了 intern() ⽅法，调⽤该⽅法时，JVM 去字符串常量池检测是否已存在该字符串，
    //如果已经存在则直接返回引⽤；如果不存在则在常量池中添加并返回其引⽤。
    //Java 6 中，字符串常量池存在 PermGen ⾥，也就是(“永久代”)，⽽这个空间是有限的，基本不会被 FullGC
    //之外的垃圾收集机制扫描。如果使⽤不当，经常会发⽣ OOM。在后续版本中，将字符串常量池放在了堆中，
    //⽽且默认缓存⼤⼩也在不断扩⼤。在 Java 8 中永久代 PermGen 也被元数据区 MetaSpace 替代。
    @Test
    public void stringTest2() {
        String str1 = "hello";
        String str2 = "hello";
        String str3 = "hello" + "world";
        String str4 = str2 + "word";
        String str5 = new String("hello");
        String str6 = new String("hello");
        String str7 = str6.intern();
        String str8 = new String("hello").intern();

        System.out.println("str1 = str2 =>" + (str1 == str2));
        System.out.println("str3 = str4 =>" + (str3 == str4));
        System.out.println("str1 = str5 =>" + (str1 == str5));
        System.out.println("str5 = str6 =>" + (str5 == str6));
        System.out.println("str1 = str7 =>" + (str1 == str7));
        System.out.println("str1 = str8 =>" + (str1 == str8));
    }

    // 字符串操作
    @Test
    public void stringOperation() {
        String str = "hello, \uD835\uDD5D\uD835\uDD60\uD835\uDD60\uD835\uDD5C";
        System.out.println(str);
        System.out.println("length => " + str.length());
        System.out.println("code point count => " + str.codePointCount(0, str.length()));

        String str2 = "hello, world";
        System.out.println(str2.substring(1));
        System.out.println(str2.substring(0, str2.length() - 1));
//        System.out.println(str2.substring(0, str2.length() + 1)); // 异常报错, 长度越界.  begin 0, end 13, length 12
    }

    // 字符串格式化
    @Test
    public void stringFormat() {
        /**
         * %s   字符串
         * %c   字符类型
         * %b   布尔类型
         * %d   整数类型(十进制)
         * %x   整数类型(十六进制)
         * %o   整数类型(八进制)
         * %f   浮点类型
         * %a   浮点类型(十六进制)
         * %%   百分比类型
         * %n   换行
         */
        System.out.printf("hello, %s", "world"); // printf 打印, 没有使用换行
        System.out.printf(" 大写a: %c %n", 'A'); // 由于是printf 打印, 此时会和上一个打印("hello, world")在一行
        System.out.printf("100 > 50: %b %n", 100 > 50); // 上一个打印有换行符, 故会在下一行打印
    }

    // String / StringBuffer/ StringBuilder
    // String 在拼接过程中或操作不当时，可能会产⽣⼤量的中间对象。⽽ StringBuffer 就是为了解决这个问题⽽提 供的⼀个类，StringBuffer 是线程安全的，如果没有线程安全的需要则使⽤ StringBuilder（Java 1.5 中新增）。
    //StringBuffer 和 StringBuilder 都继承⾃ AbstractStringBuilder 类，⽽ StringBuffer 类的所有⽅法都使 ⽤关键字 synchronized 来保证线程安全。它们的底层都是通过可修改的 char 数组（Java 9 以后改为 byte数组实现）来实现修改。以下内容没有特别说明则均基于 Java 8。
    //StringBuffer，StringBuilder 在创建时，如果未指定容量，默认容量为 16。如果容量可预估，则最好在创建时 指定合适的⼤⼩，这样可以避免多次扩容。扩容会产⽣多重开销：抛弃原有数组、创建新的数组、进行arraycopy。
    // StringBuffer, StringBuilder常用方法:
        //append: 在字符串结尾追加
        //length: 返回当前长度
        //setLength: 设置字符串长度





















}
