package com.zeroten.common.util;

import com.zeroten.common.util.lessonClass.Employee;
import com.zeroten.common.util.lessonClass.Manager;
import org.junit.Test;

import java.util.Date;

public class LessonInterface {

    /**
     * java中使用 extends 关键字来表明一个类继承自另一个类, 已存在的类成为超类(superclass), 基类(baseclass) 或者父类(parent class)
     * 新创建的类成为子类(subclass), 派生类(derived class) 或者孩子类(child class).
     */

    @Test
    public void testClass() {
        Employee employee = new Employee();
        employee.setName("普通员工");
        employee.setHireDay(new Date());
        employee.setSalary(1000);
        System.out.println(employee.toString());

        Manager manager = new Manager();
        manager.setName("经理");
        manager.setHireDay(new Date());
        manager.setBonus(200);
        manager.setSalary(1500);
        System.out.println(manager.toString());
    }
}
