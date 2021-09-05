package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext1.xml");
        Dog dog = context.getBean("myDog", Dog.class);
        Dog dog1 = context.getBean("myDog", Dog.class);
        dog.setName("sda");
        dog1.setName("das");
        System.out.println(dog.getName());
        System.out.println(dog1.getName());
        System.out.println("are they the same? " + (dog == dog1));
        System.out.println(dog);
        System.out.println(dog1);

    }
}
