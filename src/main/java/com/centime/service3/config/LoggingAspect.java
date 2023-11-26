package com.centime.service3.config;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class LoggingAspect {
    @Before(value = "execution(* com.centime.service3.service.*.*(..))")
    public void beforeAdvice(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        log.info("*** Start of : " + signature.getDeclaringType() + " -  "+signature.getName() +" method *** ");
    }

    @Before(value = "execution(* com.centime.service3.service.*.*(..))")
    public void afterAdvice(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        log.info("*** End of : " + signature.getDeclaringType() + " -  "+signature.getName()+" method *** ");
    }
}
