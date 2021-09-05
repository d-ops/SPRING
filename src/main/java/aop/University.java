package aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class University {
    List<Student> students = new ArrayList<>();
    public void addStudents(){
        Student student1 = new Student("Михал Палыч", 1, 8.4);
        Student student2 = new Student("Евгений Сидоров", 2, 9.1);
        Student student3 = new Student("Яшин Лев", 3, 7.2);

        students.add(student1);
        students.add(student2);
        students.add(student3);
    }

    public List<Student> getStudents(){
        System.out.println("начало работы метода getStudents");
        System.out.println("info about students");
        try {
            students.get(3);
        } catch (Exception e){
            System.out.println("было поймано исключение: " + e);
        }
        System.out.println(students);
        return students;
    }
}
