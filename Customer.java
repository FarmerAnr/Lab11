public class Customer implements Runnable {
    private BankAccount account;
    private String action;
    private int amount;

    // Constructor
    public Customer(BankAccount account, String action, int amount) {
        this.account = account;
        this.action = action;
        this.amount = amount;
    }

    // Thread ajillah uildel
    public void run() {
        if (action.equals("deposit")) {
            account.deposit(amount);
        } else if (action.equals("withdraw")) {
            account.withdraw(amount);
        }
    }
}