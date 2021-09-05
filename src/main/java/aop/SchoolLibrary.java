package aop;

import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary extends AbstractLibrary {

    public void getBook(){
        System.out.println("взяли книгу из SchoolLibrary");
    }
    public void getMagazine(){
        System.out.println("мы взяли жургал из SchoolLibrary ");
    }
}
