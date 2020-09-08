import java.util.Random;
public class Client {
    Random rand = new Random();
    private int balance;
    private boolean validAccount;
    private int accountNumber;
    private String name;
    public Client(String name) {
        this.name = name;
        this.validAccount = true;
        this.accountNumber = rand.nextInt(1000);
    }
    public boolean isClient(int accountNumber) {
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

    public void increase(int amount) {
        balance += amount;
    }
}
