import java.util.ArrayList;
public class Bank {
    private String bankName;
    private int revenue;
    private ArrayList<Client> clients = new ArrayList<Client>();
    public Bank(String bankName, int revenue)  {
        this.bankName = bankName;
        this.revenue = revenue;
    }
    public void withdraw(int amount, Client client, String accountNumber) {
//        boolean auth = client.isClient(accountNumber);
//        int balance = client.getBalance();
//        boolean valid = client.isValid();
        if (amount <= client.getBalance() && client.isValid() && client.isClient(accountNumber)){
            client.decrease(amount);
        }
    }
    public void deposit(int amount, Client client) {
        if (client.isValid()){
            client.increase(amount);
        }
    }
    public void newClient(String name, String accountNumber) {
        Client client = new Client(name, accountNumber);
        clients.add(client);
    }
    public void showClients() {
        for (Client client : clients) {
            client.getInfo();
        }
    }
    public Client getClient(String accountNumber) {
        for (Client client: clients) {
            if(client.getAccountNumber() == accountNumber) {
                return client;
            }
        }
        return null;
    }

}
