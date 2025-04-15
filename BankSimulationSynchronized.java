public class BankSimulationSynchronized {
    public static void main(String[] args) throws InterruptedException {
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

        // Bukh thread duusahyg huleeh
        for (Thread t : customers) {
            t.join();
        }

        // Final uldegdliig hevleh
        System.out.println("Final Uldegdel: " + account.getBalance());
    }
}