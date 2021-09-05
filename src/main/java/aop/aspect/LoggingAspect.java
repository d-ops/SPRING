package aop.aspect;

import aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAspect {











//
//    @Pointcut("execution(* aop.UniversityLibrary.get*())")
//        private void allGetMethodsFromUniLibrary() {
//    }
//
//    @Pointcut("execution(* aop.UniversityLibrary.return*())")
//    private void allReturnMethodsFromUniLibrary() {
//    }
//
//    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()")
//    private void allGetAndReturnMethodsFromUniLibrary(){
//
//    }
//
//@Before("allGetAndReturnMethodsFromUniLibrary()")
//public void beforeGetAndReturnLoggingAdvice(){
//    System.out.println("beforeGetAndReturnLoggingAdvice writing log#3");
//}
//
//@Before("allGetMethodsFromUniLibrary()")
//    public void beforeGetLoggingAdvice(){
//    System.out.println("beforeGetLoggingAdvice: writing log#1");
//}
//
//@Before("allReturnMethodsFromUniLibrary()")
//    public void beforeReturnLoggingAdvice(){
//    System.out.println("beforeReturnLoggingAdvice: writing log#2");
//}
//
//
//
//
//
//




    @Before("aop.aspect.MyPointcuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint){

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature " + methodSignature);
        System.out.println("methodSignature.getMethod() " + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType() " + methodSignature.getReturnType());
        System.out.println("methodSignature.getName() " + methodSignature.getName());

        if(methodSignature.getName().equals("addBook")){
            Object[] args = joinPoint.getArgs();
            for (Object obj: args) {
                if(obj instanceof Book){
                    Book book = (Book) obj;
                    System.out.println("Информация о названии книги - " + book.getName() +
                            "автор " + book.getAuthor()
                            + "год выпуска " + book.getYearOfPublication());
                }
                else if (obj instanceof String){
                    System.out.println("кто добавил книгу? " + obj);
                }
            }
        }
        
        System.out.println("beforeAddBookAdvice логирование попытки" +
                " получить книгу-журнал");
        System.out.println("--------------------------------------");

    }

}
