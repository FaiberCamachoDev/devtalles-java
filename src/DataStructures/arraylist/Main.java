package DataStructures.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        // estructura de datos estatica es aquella que se define cuantos tiene. ejemplo
        Integer[] numbers = {1,2,3};
        System.out.println(numbers[0]);
        numbers[0] = 100;
        System.out.println(numbers[0]);
        // tambien se puede definir que tan grande quiero que sea
        int[] fixedArray = new int[100];
        System.out.println("dimension: " + fixedArray.length);

        // Dinamica - arraylist, entre <> definimos el tipo de dato a guardar
        ArrayList<Integer> numers2 = new ArrayList<>();
        numers2.add(1);
        numers2.add(10);
        numers2.add(20);
        System.out.println(numers2);


        // estructuras dinamicas - framework de colecciones
        //list
        List<String> student = new ArrayList<>();
        student.add("Ana");
        student.add("Awera");
        student.add("Ane");
        student.add("gabo");
        System.out.println(student);

        System.out.println(student.get(0));

        student.remove("Ana");
        System.out.println(student);
        System.out.println(student.remove(0));
        System.out.println(student);

        System.out.println(student.set(0, "Awosisimo"));
        System.out.println(student);

        System.out.println(student.contains("gabo"));


    }
}
