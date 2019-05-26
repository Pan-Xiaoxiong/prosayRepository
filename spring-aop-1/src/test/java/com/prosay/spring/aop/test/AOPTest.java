package com.prosay.spring.aop.test;

import com.prosay.spring.aop.Calculator;
import com.prosay.spring.aop.config.MainConfig;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AOPTest {

    private ApplicationContext context;
    private Calculator calculator;

    @Before
    public void setUp() {
        this.context = new AnnotationConfigApplicationContext(MainConfig.class);
        this.calculator = this.context.getBean(Calculator.class);
    }

    @Test
    public void test() {
        int result = this.calculator.div(10, 2);
        System.out.println(result);
        //以下为自己测试
        this.calculator.ceshi();
        System.out.println("自己测试方法执行完");
    }
}
