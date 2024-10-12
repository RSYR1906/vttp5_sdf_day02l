package Workshop2_practice;

public class BankAccountMain {

    public static void main(String[] args) {

        BankAccount ba = new BankAccount("John");
        ba.deposit(1000);
        ba.withdraw(500);

        FixedDepositAccount fda = new FixedDepositAccount("Louis", 500f, 5.0f, 24);
        fda.deposit(500);
        fda.withdraw(100);

        System.out.println("\nDetails of user's Bank Account");
        System.out.println("===============================");
        System.out.println(ba.getAccName());
        System.out.println(ba.getAccNum());
        System.out.println(ba.getAccBalance() + "\n");

        System.out.println("Details of user's Fixed Deposit Account");
        System.out.println("========================================");
        System.out.println(fda.getAccName());
        System.out.println(fda.getAccNum());
        System.out.println(fda.getBalance());

    }
}
