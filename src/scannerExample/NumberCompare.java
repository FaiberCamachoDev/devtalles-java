package scannerExample;

import java.awt.*;
import java.util.Scanner;

public class NumberCompare {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // con new se crea el objeto y lo siguiente es el nombre de la clase
        System.out.println("insert the first number");
        int a = sc.nextInt(); //input recibe solo int
        System.out.println("insert the second number");
        int b = sc.nextInt();
        System.out.println("Print total: " + (a+b));
        System.out.println("Print total rest: " + (a-b));

        if (a>b){
            System.out.println("First number is greater than second");
        }else if (a == b){
            System.out.println("the numbers are equals");
        }else {
            System.out.println("Second number is greater than first");
        }
    }
}
