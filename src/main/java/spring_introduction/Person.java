package spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {
    Pet pet;
//    @Value("${person.surname}")
    String surName;
 //   @Value("${person.age}")
    String age;

    public String getSurName() {

        return surName;
    }

    public void setSurName(String surName) {
        System.out.println("Person: setSurName");
        this.surName = surName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        System.out.println("Person: setAge");
        this.age = age;
    }
//        @Autowired
//        public Person(@Qualifier("catBean") Pet pet) {
//        System.out.println("Person bean is created");
//        this.pet = pet;
//    }
    public Person(Pet pet) {
        System.out.println("Person bean is created");
        this.pet = pet;
    }
    public void setPet(Pet pet) {
        System.out.println("Class person: set pet");
        this.pet = pet;
    }

    public void callYourPet(){
        System.out.println("Hello, my Lovely pet");
        pet.say();
    }
}
