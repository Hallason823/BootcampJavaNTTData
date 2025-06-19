import java.time.OffsetDateTime;

public class Person {

    private final String name;
    private int age;
    private int lastYearAgeInc;
    private static String test;
    
    public Person(String name) {
        this.name = name;
        this.age = 1;
        this.lastYearAgeInc = OffsetDateTime.now().getYear();
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.lastYearAgeInc = OffsetDateTime.now().getYear();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    //public void setName(String name) {
    //    this.name = name;
    //}

    //public void setAge(int age) {
    //    this.age = age;
    //}

    public static String getTest() {
        return test;
    }
    
//I can't acess with this, because test is static
//as instancias compartilham estes valores estáticos
//o valor é da classe, não pertence a instância
//metodos estáticos não tem acesso ao this
//i.e., não conseguir acessar atributos não estáticos

    public static void setTest(String testParam) {
        test = testParam;
    }

    public void incAge() {

        if (this.lastYearAgeInc >= OffsetDateTime.now().getYear()) return;
        this.age += 1;
        this.lastYearAgeInc = OffsetDateTime.now().getYear();
    }
}