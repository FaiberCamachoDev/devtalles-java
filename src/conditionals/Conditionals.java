package conditionals;

public class Conditionals {
    public static void main(String[] args) {
        int age = 8;
        if (age >= 18){
            System.out.println("Is an adult");
        }
        else if (age <= 0){
            System.out.println("Not is a valid age");
        }
        else {
            System.out.println("Your a minor");
        }

        int day = 30;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Holi juasjuas");
        }

    }
}
