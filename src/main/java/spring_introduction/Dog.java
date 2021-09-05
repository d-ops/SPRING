package spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


public class Dog implements Pet{
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Dog() {
        System.out.println("Dog bean is created");
    }

    @Override
    public void say() {
        System.out.println("Wowowow");
    }


    public void init(){
        System.out.println("init dog");
    }
    public void destroy(){
        System.out.println("destroy dog");
    }
}
