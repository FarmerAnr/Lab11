import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BankSimulationExecutor {
    public static void main(String[] args) throws InterruptedException {
        BankAccount account = new BankAccount();

        // 2 thread-tui pool uusgeh
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Ajluudiig oruulah
        executor.submit(new Customer(account, "deposit", 500));
        executor.submit(new Customer(account, "withdraw", 700));
        executor.submit(new Customer(account, "withdraw", 600));

        // Executor-iig haah
        executor.shutdown();

        // Bukh ajil duusahyg huleeh
        while (!executor.isTerminated()) {
            Thread.sleep(100);
        }

        // Final uldegdliig hevleh
        System.out.println("Final Uldegdel: " + account.getBalance());
    }
}