package com.zeroten.common.util.lessonClass;

import java.util.Date;

public class Employee {
    private Integer salary;
    private String name;
    private Date hireDay;

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getHireDay() {
        return hireDay;
    }

    public void setHireDay(Date hireDay) {
        this.hireDay = hireDay;
    }
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("员工: ");
        str.append(getName());
        str.append(", 入职时间: ");
        str.append(getHireDay());
        str.append(", 薪水: ");
        str.append(getSalary());
        str.append(" 元/天");
        return str.toString();
    }

//    @Test
//    public void testClass() {
//        Employee employee = new Employee();
//        employee.setName("普通员工");
//        employee.setHireDay(new Date());
//        employee.setSalary(1000);
//        System.out.println(employee.toString());
//    }
}
