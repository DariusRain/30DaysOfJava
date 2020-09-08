public class Bank {
    private String bankName;
    private int revenue;
    public Bank(String bankName, int revenue)  {
        this.bankName = bankName;
        this.revenue = revenue;
    }
    public void withdraw(int amount, Client client, int accountNumber) {
        boolean auth = client.isClient(accountNumber);
        if (amount <= client.balance && client.validAccount && auth){
            client.decrease(amount);
        }
    }
    public void deposit(int amount, Client client) {
        if (client.validAccount){
            client.increase(amount);
        }
    }


}
