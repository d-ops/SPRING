package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

       University university =  context.getBean("university", University.class);
       university.addStudents();
        List<Student> students = university.getStudents();
        System.out.println(students);
        //Student student = context.getBean("student", Student.class);
//        student.getCourse();
        SchoolLibrary aLi = context.getBean("schoolLibrary", SchoolLibrary.class);
        Book aLi1 = context.getBean("book", Book.class);
        Ali ali = context.getBean("ali", Ali.class);
        context.close();
    }
}
