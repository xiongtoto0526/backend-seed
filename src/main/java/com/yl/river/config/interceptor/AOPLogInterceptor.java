package com.yl.river.config.interceptor;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.lang.reflect.Method;



@Aspect
@Component
public class AOPLogInterceptor {

    private static final Logger logger = LoggerFactory.getLogger(AOPLogInterceptor.class);

    private ThreadLocal<Long> beginTime = new ThreadLocal<>();

    @Autowired
    private ObjectMapper jsonMapper;

    // 拦截controller层的方法，并打印出入参数、耗时。
    @Pointcut("execution(* com.yl.river.controller..*.*(..))")
    public void log() {
    }

    @Before("log()")
    public void before(JoinPoint joinPoint) throws Throwable {
        beginTime.set(System.currentTimeMillis());
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        logger.info("{} {} controller-start :", method.getDeclaringClass(), method.getName());
        int i = 0;
        for (Object arg : joinPoint.getArgs()) {
            i++;
            logger.info("request param ====> arg{}: {}", i, toLogStr(arg));
        }
    }


    @AfterReturning(pointcut = "log()", returning = "retObj")
    public void afterReturning(JoinPoint joinPoint, Object retObj) throws Throwable {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
//		logger.info("Return object <==== {}", toLogStr(retObj)); // 大对象不建议打日志，后续增加配置
        logger.info("{} {} controller-done  : cost ({}) ms .", method.getDeclaringClass(), method.getName(), System.currentTimeMillis() - beginTime.get());
        logger.info(" ");
    }

    private String toLogStr(Object arg) throws JsonProcessingException {
        String argStr = "";
        if (arg instanceof String) {
            argStr = (String) arg;
        } else if (arg instanceof ServletRequest || arg instanceof ServletResponse || arg instanceof Model || arg instanceof MultipartFile) {
            argStr = arg.getClass().getName();
        } else {
            argStr = jsonMapper.writeValueAsString(arg);
        }
        return argStr;
    }

}
