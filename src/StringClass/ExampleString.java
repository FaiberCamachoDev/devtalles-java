package StringClass;

import java.awt.*;

public class ExampleString {
    public static void main(String[] args) {
        String name = "gabriel";

        System.out.println(name);

        Person person1 = new Person("Gabriel", "Montes");
        System.out.println(person1.toString());

    }
}
