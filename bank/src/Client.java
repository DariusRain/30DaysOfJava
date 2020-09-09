//import java.util.Random;
public class Client {
//    Random rand = new Random();
    private int balance;
    private boolean validAccount;
    private String accountNumber;
    private String name;
    public Client(String name, String accountNumber) {
        this.name = name;
        this.validAccount = true;
        this.accountNumber = accountNumber;
    }
    public boolean isClient(String accountNumber) {
        if (this.accountNumber == accountNumber) {
            return true;
        } else {
            return false;
        }
    }
    public void invalidateAccount() {
        validAccount = false;
    }
    public int getBalance() {
        return balance;
    }
    public boolean isValid() {
        return validAccount;
    }
    public void decrease(int amount) {
        balance -= amount;
    }
    public void getInfo() {
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
    public void increase(int amount) {
        balance += amount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}
