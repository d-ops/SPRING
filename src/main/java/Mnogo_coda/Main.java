package Mnogo_coda;

import java.util.EnumMap;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Mr");
        employee.setSurName("mrs");
        Car car = new Car();
        car.setAge(3);
        car.setMark("ford");
        employee.setCar(car);
        Pet pet = new Pet();
        pet.setAge(4);
        pet.setName("Murka");
        System.out.println(employee.toString());
        employee.setPet(pet);
        System.out.println(employee.toString());
    }
}
