package FEB10th;

class BankVault {
    private static double totalVaultBalance = 0;

    public static void deposit(double amount) {
        totalVaultBalance += amount;
    }

    public static void showBalance() {
        System.out.println("Total Vault Balance = " + totalVaultBalance);
    }
}

public class Assignment2 {
    public static void main(String[] args) {

        BankVault user1 = new BankVault();
        BankVault user2 = new BankVault();
        BankVault user3 = new BankVault();

        user1.deposit(1000);
        user2.deposit(2000);
        user3.deposit(500);

        BankVault.showBalance();
    }
}
