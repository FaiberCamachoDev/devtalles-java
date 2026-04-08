package finalproject;
//creacion de la clase BankAcc
public class BankAcc {
    //definir atributos privs
    private String accHolder;
    private double balance;
    //constructor
    public BankAcc(String accHolder, double balance) {
        this.accHolder = accHolder;
        this.balance = balance;
    }
    //metodos
    public void deposit(double amount){ // parametro double amount ya que necesita el monto de lo que depositara
        if (amount > 0){
            balance += amount;
            System.out.println("«Deposit Successfully»");
        }else {
            System.out.println("«Insert a valid amount»");
        }

    }
    public void withdraw(double amount){
        if (amount > 0 && amount <= balance){ // and verifica que el monto no sea superior al balance actual
            balance -= amount;
            System.out.println("«Successfully withdraw»");
        }else{
            System.out.println("«Insert a valid amount»");
        }
    }
    public void showCurrency(){
        System.out.println("Actual Currency: " + balance);
    }
}
