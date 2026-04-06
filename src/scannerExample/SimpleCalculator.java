package scannerExample;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // con new se crea el objeto y lo siguiente es el nombre de la clase

        int first = getNumber(scanner,  "Insert the first number");
        int second = getNumber(scanner,  "Insert the second number");

        // make the operations inside a variable.
        int sum = first + second;
        int rest = first - second;

        showOperations(sum, rest);

        compareNumber(first, second);

        scanner.close();
    }
    public static int getNumber(Scanner scanner, String message){
        System.out.println(message);
        int number = scanner.nextInt(); //input recibe solo int
        return number;
    }
    public static void showOperations(int fsuma, int frest){
        System.out.println("Print total: " + fsuma);
        System.out.println("Print total rest: " + frest);

    }
    public static void compareNumber(int first, int second){
        //validate conditional inside variable
        boolean isGreater = first > second;
        boolean isEqual = first == second;
        if (isGreater){
            System.out.println("First number is greater than second");
        }else if (isEqual){
            System.out.println("the numbers are equals");
        }else {
            System.out.println("Second number is greater than first");
        }
    }
}
