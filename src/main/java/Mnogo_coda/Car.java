package Mnogo_coda;

public class Car {
    private String mark;
    private int age;

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", age=" + age +
                '}';
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
