package constants;

public class constantes {
    public static void main(String[] args) {
        final double TAX_RATE = 0.10; // se pone final para definiar como const
        int grossSalary = 3000;
        double netSalary = grossSalary * (1 - TAX_RATE);
        System.out.println("net salary = " + netSalary);

    }
}
