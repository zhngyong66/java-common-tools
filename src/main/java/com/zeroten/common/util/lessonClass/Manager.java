package com.zeroten.common.util.lessonClass;

//import org.testng.annotations.Test;
//import org.junit.jupiter.api.Test;
//import org.junit.Test;
import java.util.Date;

public class Manager extends Employee {
    private Integer bonus;

    public Integer getBonus() {
        return bonus;
    }

    public interface Interface {
        class InnerClass {}
        interface InnerInterface {}
        int MAX_COUNT = 100;
        void method();
    }
    public void setBonus(Integer bonus) {
        this.bonus = bonus;
    }
    @Override
    public Integer getSalary() {
//        System.out.println(super.getSalary());
//        System.out.println(bonus);
        return super.getSalary() + bonus;
    }

    public static void main(String [] args) {
        Manager manager = new Manager();
        manager.setName("经理");
        manager.setHireDay(new Date());
        manager.setBonus(200);
        manager.setSalary(1500);
        System.out.println(manager.toString());
    }

//    @Test
//    public void testManager() {
//        Manager manager = new Manager();
//        manager.setName("经理");
//        manager.setHireDay(new Date());
//        manager.setBonus(200);
//        manager.setSalary(1500);
//        System.out.println(manager.toString());
//    }

}
