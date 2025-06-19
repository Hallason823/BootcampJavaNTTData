import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var male = new Person("João");
        var female = new Person("Maria");
        Person.setTest("test 123");
        //male.setAge(12);
        //female.setAge(10);
        male.incAge();
        female.incAge();
        System.out.println("Male name: " + male.getName() + " age: " + male.getAge() + " test: " + Person.getTest());
        System.out.println("Female name: " + female.getName() + " age: " + female.getAge() + " test: " + Person.getTest());
    }
}