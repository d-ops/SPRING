package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");
        Dog dog1 = context.getBean("dog", Dog.class);
        Dog dog2 = context.getBean("dog", Dog.class);
        System.out.println("are these objects watching to the same obj? " +
                (dog1 == dog2));
        System.out.println(dog1);
        System.out.println(dog2);
        context.close();
    }
}
