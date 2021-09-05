package aop.aspect;

import org.aspectj.lang.annotation.Before;

public class ExceptionHandlingAspect {
    @Before("aop.aspect.MyPointcuts.allGetMethods()")
    public void beforeAddExceptionHandlingAdvice(){
        System.out.println("beforeAddExceptionHandlingAdvice : ловим обрабатываем" +
                "исключения при попытке получить книгу - журнал");
        System.out.println("--------------------------------------");

    }
}
