import java.util.Random;
public class Client<accountNumber> {
    Random rand = new Random();
    private int balance;
    private boolean validAccount;
    int accountNumber;
    private String routingNumber;
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

    public void decrease(int amount) {
        balance -= amount;
    }

    public void increase(int amount) {
        balance += amount;
    }
}
