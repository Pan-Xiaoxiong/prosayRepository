package com.prosay.spring.aop;

public class Calculator {

    /**
     * 业务逻辑代码
     * @param i
     * @param j
     * @return
     */
    public int div(int i, int j) {
        System.out.println("计算器进来了，业务逻辑代码执行");
        return i / j;
    }


    //自己测试
    public void ceshi() {
        System.out.println("业务逻辑代码测试");
    }
}
