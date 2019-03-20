package com.concurrency.demo.aspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class log {


    @Pointcut("@annotation(com.concurrency.demo.annotation.log)")
    public void fn(){}

    @Before(value = "fn()")
    public void recordBefore(){
        System.out.println("log-before:"+System.currentTimeMillis());
    }

    @AfterReturning(value = "fn()")
    public void recordAfter(){
        System.out.println("log-after:"+System.currentTimeMillis());
    }
}
