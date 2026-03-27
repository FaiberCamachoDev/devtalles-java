package HomeWork1;

import java.awt.*;
import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean repeat;
        do {
            System.out.println("Insert your age");
            int age = sc.nextInt();

            System.out.println("Insert 3 notes");
            System.out.println("note1: ");
            int grade1 = sc.nextInt();
            System.out.println("note2: ");
            int grade2 = sc.nextInt();
            System.out.println("note3: ");
            int grade3 = sc.nextInt();

            int sum = grade1 + grade2 + grade3;

            double average = sum/3d;

            boolean hasPass = average >= 6;
            if (hasPass){
                System.out.println("You approved! Age: " +age);
            }else {
                System.out.println("You failed! Age: " +age);
            }
            System.out.println("dou you want to enter new data? (1 = yes / 0 = no)");
            int option = sc.nextInt();
            repeat = option == 1;
        }while (repeat);



    }
}
