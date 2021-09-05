package aop.aspect;

import aop.Student;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {
    @Before("execution (* getStudents())")
    private void beforeGetStudentsLoggingAdvice(){
        System.out.println("beforeGetStudentsLoggingAdvice: логируем получение" +
                "списка студентов перед методом getStudents");
    }

//    @AfterReturning( pointcut = "execution (* getStudents())",
//    returning = "students")
//    private void afterReturningGetStudentsLoggingAdvice(List<Student> students){
//        Student firstStudent = students.get(0);
//        String nameSurname = firstStudent.getNameSurname();
//        nameSurname = "Mr. " + nameSurname;
//        firstStudent.setNameSurname(nameSurname);
//
//        double average = firstStudent.getAvg();
//        average += 1;
//        firstStudent.setAvg(average);
//
//
//        System.out.println("afterReturningGetStudentsLoggingAdvice: логируем получение" +
//                "списка студентов после работы метода getStudents");
//    }
@AfterThrowing("execution ( * getStudents())")
    private void afterThrowingGetStudentsLoggingAdvice(){
    System.out.println("afterThrowingGetStudentsLoggingAdvice: логируем выброс " +
            "исключения");
}

}
