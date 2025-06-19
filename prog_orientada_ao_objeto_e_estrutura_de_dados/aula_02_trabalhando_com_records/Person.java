//record allows only define static fields in the body
// all fields shows is used in the constructor
//also they are privates and final
//record is an imutable class
public record Person(String name, int age) {

    public Person {
    }

    public Person(String name) {
        this(name, 1);
    }

    public String getInfo() {
        return "Name: " + name + " | Age: " + age;
    }
}