package finalproject;

import java.util.Scanner;

public class BankApp {
    private BankAcc acc; // crea acc con tipo de objeto BankAcc
    private Scanner sc;

    public BankApp(BankAcc acc) {
        this.acc = acc;
        this.sc = new Scanner(System.in);
    }
    public void start(){
        int option;
        do {
            showMenu();
            option = sc.nextInt();
            processOption(option);
        } while (option != 4);
    }
    public void showMenu(){
        System.out.println("\n«Welcome to the BankApp»\n1. Deposit an amount\n 2.Withdraw an amount\n 3. Show Currency\n 4. Exit");
    }
    private int getUserOption(){
        return sc.nextInt();
    }
    private void handledDeposit(){
        System.out.println("Insert the amount to deposit: ");
        double deposit = sc.nextDouble();
        acc.deposit(deposit);
    }
    private void handledWithdraw(){
        System.out.println("Insert the amount to withdraw: ");
        double withdraw = sc.nextDouble();
        acc.withdraw(withdraw);
    }
    private void processOption(int option){
        switch (option){
            case 1:{
                handledDeposit();
                break;
            }
            case 2: {
                handledWithdraw();
                break;
            }
            case 3: {
                acc.showCurrency();
                break;
            }
            case 4: {
                System.out.println("«Thank you for use the app»");
                break;
            }
            default:{
                System.out.println("«Invalid option choose a right one»");
            }
        }
    }
}
