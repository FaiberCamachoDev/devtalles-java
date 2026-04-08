package finalproject;

public class Main {
    public static void main(String[] args) {
        BankAcc bankAccount = new BankAcc("Duvan", 500.0);
        BankApp bankApp = new BankApp(bankAccount);
        bankApp.start();
    }
}
