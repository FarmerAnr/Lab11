public class BankAccount {
    private int balance = 1000;

    // Hadgalamj hiih method
    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("Hadgalamj: " + amount + ", Uldegdel: " + balance);
    }

    // Mongo tatah method
    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Tatlaga: " + amount + ", Uldegdel: " + balance);
        } else {
            System.out.println("Hangaltgui mongo: " + amount);
        }
    }

    // Uldegdliig avah method
    public int getBalance() {
        return balance;
    }
}