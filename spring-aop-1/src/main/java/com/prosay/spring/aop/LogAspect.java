package com.prosay.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

/**
 * 切面
 */
@Aspect
public class LogAspect {

    /**
     * 切入点
     */
//    @Pointcut("execution(public int com.prosay.spring.aop.Calculator.*(..))")
    @Pointcut("execution(* com.prosay.spring.aop.Calculator.*(..))") //自己测试
    public void pointCut() {

    }

    /**
     * 前通知
     *
     * @param joinPoint 连接点
     */
//    @Before("pointCut()")
    @Before("execution(* com.prosay.spring.aop.*.*(..))") //这种方式不用借助上面的pointCut方法，比较简化
    public void logStart(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println(name + "-----" + Arrays.toString(args) + "开始执行");
    }


    /**
     * 后通知
     * @param joinPoint
     */
    @After("pointCut()")
    public void logEnd(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        System.out.println(name + "方法执行完毕了");

    }

    /**
     * 返回通知
     * @param object
     */
    @AfterReturning(value = "pointCut()",returning = "object")
    public void logReturn(Object object) {
        System.out.println("方法的执行的返回值为：" + object);
    }

    /**
     * 异常通知
     * @param exception
     */
    @AfterThrowing(value = "pointCut()",throwing = "exception")
    public void logException(Exception exception) {
        System.out.println("方法执行出现异常，异常信息为："+ exception.getMessage());
    }

    /**
     * 环绕通知
     * @param proceedingJoinPoint
     * @return
     * @throws Throwable
     */
    @Around(value = "pointCut()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("执行目标方法之前");
        Object returnObj = proceedingJoinPoint.proceed();
        System.out.println("执行目标方法之后");
        return returnObj;
    }

}
