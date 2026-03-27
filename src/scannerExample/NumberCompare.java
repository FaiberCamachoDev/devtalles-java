package scannerExample;

import java.awt.*;
import java.util.Scanner;

public class NumberCompare {
    public static void main(String[] args) {
// refactor code: change name of variables to logic name.

        Scanner sc = new Scanner(System.in); // con new se crea el objeto y lo siguiente es el nombre de la clase
        System.out.println("insert the first number");
        int a = sc.nextInt(); //input recibe solo int
        System.out.println("insert the second number");
        int b = sc.nextInt();
        // make the operations inside a variable.
        int sum = a + b;
        int rest = a - b;

        System.out.println("Print total: " + sum);
        System.out.println("Print total rest: " + rest);
        //validate conditional inside variable
        boolean isGreater = a > b;
        boolean isEqual = a == b;
        if (isGreater){
            System.out.println("First number is greater than second");
        }else if (isEqual){
            System.out.println("the numbers are equals");
        }else {
            System.out.println("Second number is greater than first");
        }
        System.out.println("End App");
        sc.close();
    }
}
