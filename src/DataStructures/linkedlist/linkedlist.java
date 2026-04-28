package DataStructures.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class linkedlist {
    public static void main(String[] args){

        List<String> cities = new LinkedList<>();
        cities.add("New York");
        cities.add("Medellin");
        cities.add("Bogota");
        cities.add("Tokyo");
        cities.add("asd");
        System.out.println(cities);

        ((LinkedList<String>)cities).addFirst("London");
        ((LinkedList<String>)cities).addLast("Berlin");
        System.out.println(cities);

        System.out.println(cities.set(2, "Madrid"));
        System.out.println(cities);

        System.out.println(cities.remove("New York"));
        System.out.println(cities);


    }
}
