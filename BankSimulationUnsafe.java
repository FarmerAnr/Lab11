public class BankSimulationUnsafe {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        Thread[] customers = new Thread[3];

        // 3 hereglegch uusgeh
        customers[0] = new Thread(new Customer(account, "deposit", 500));
        customers[1] = new Thread(new Customer(account, "withdraw", 700));
        customers[2] = new Thread(new Customer(account, "withdraw", 600));

        // Thread-uudiig ehluleh
        for (Thread t : customers) {
            t.start();
        }
    }
}