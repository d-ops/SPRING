package aop;

import org.springframework.stereotype.Component;

@Component
public class UniversityLibrary extends AbstractLibrary {
    @Override
    public void getBook(){
        System.out.println("we have took the book from UniversityLibrary ");
        System.out.println("--------------------------------------");
    }

    public String returnBook(){
        System.out.println("returning back book from UniLibrary");
        return "Война и мир";
    }
    public void getMagazine(){
        System.out.println("мы взяли жургал из SchoolLibrary ");
        System.out.println("--------------------------------------");
    }
    public void returnMagazine(){
        System.out.println("мы возвращаем журнал из SchoolLibrary ");
        System.out.println("--------------------------------------");

    }
    public void addBook(String person_name, Book book){
        System.out.println("we have adding the book to UniversityLibrary ");
        System.out.println("--------------------------------------");

    }
    public void addMagazine(){
        System.out.println("we have adding the magazine to UniversityLibrary ");
        System.out.println("--------------------------------------");

    }

}
