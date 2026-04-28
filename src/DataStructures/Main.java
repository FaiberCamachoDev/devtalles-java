package DataStructures;

import java.util.ArrayList;

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

    }
}
