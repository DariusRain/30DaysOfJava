import java.util.Date;

public class Account extends Client {
    public class CheckingAccount {
        private String dateOfCreation;
        private String dateOfLastDeposit;
        private String dateOfLastWithdraw;
        private String amountOfLastDeposit;
        private String amountOfLastWithdraw;
        private int balance;
        public CheckingAccount() {

        }
    }
    public class SavingsAccount {
        private String dateOfCreation;
        private String dateOfLastDeposit;
        private String dateOfLastWithdraw;
        private String amountOfLastDeposit;
        private String amountOfLastWithdraw;
        private int balance;
    }
    public Account() {

    }
}
