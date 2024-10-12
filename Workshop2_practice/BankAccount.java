package Workshop2_practice;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class BankAccount {

    private final String accName;
    private final String randomGenAccNum = "";
    private float accBalance;
    private List<String> transactionHistory;
    private boolean accClosed;
    private String accOpen;
    private String accClose;

    public BankAccount(String accName) {
        this.accName = accName;
        this.accBalance = 0.0f;
        this.transactionHistory = new ArrayList<>();
        this.accClosed = false;
        this.accOpen = getCurrentDate();
        this.accClose = getCurrentDate();
    }

    public BankAccount(String accName, float accBalance) {
        this.accName = accName;
        this.accBalance = accBalance;
    }

    public String getAccName() {
        return accName;
    }

    public String getAccNum() {
        Random random = new Random();
        String randomGenAccNum = String.format("%09d", random.nextInt(1000000000));
        return randomGenAccNum;
    }

    public float getAccBalance() {
        return accBalance;
    }

    public void setAccBalance(float accBalance) {
        this.accBalance = accBalance;
    }

    public void getTransactionHistory() {
        System.out.println(transactionHistory);
    }

    public void setTransactionHistory(List<String> transactionHistory) {
        this.transactionHistory = transactionHistory;
    }

    public boolean isAccClosed() {
        return accClosed;
    }

    public void setAccClosed(boolean accClosed) {
        this.accClosed = accClosed;
    }

    public String getAccOpen() {
        return accOpen;
    }

    public void setAccOpen(String accOpen) {
        this.accOpen = accOpen;
    }

    public String getAccClose() {
        return accClose;
    }

    public void setAccClose(String accClose) {
        this.accClose = accClose;
    }

    public String getCurrentDate() {
        LocalDateTime currentDateTime = LocalDateTime.now();

        // Define a formatter for the desired pattern
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // Format the LocalDateTime into a String
        String formattedDateTime = currentDateTime.format(formatter);

        return formattedDateTime;
    }

    public void deposit(int amount) {
        if (amount < 0 || accClosed == true) { // if amount < 0 or account is closed, throw IllegalArgumentException
            throw new IllegalArgumentException("Deposit amount cannot be less than 0 and account must be open");
        } else {
            accBalance += amount; // deposit money into account (accBalance += amount)
            transactionHistory.add("deposit " + amount + " at " + java.time.LocalDateTime.now());
        }
    }

    public void withdraw(int amount) {
        if (amount < 0 || accClosed == true) { // if amount < 0 or account is closed, throw IllegalArgumentException

            throw new IllegalArgumentException("Withdrawal amount cannot be less than 0 and account must be open");
        } else {
            if (amount < 0 || accClosed == true) { // if amount < 0 or account is closed, throw IllegalArgumentException
                throw new IllegalArgumentException("Deposit amount cannot be less than 0 and account must be open");
            } else {
                accBalance -= amount; // withdraw money into account (accBalance -= amount)
                transactionHistory.add("Withdrawal " + amount + " at " + java.time.LocalDateTime.now());
            }
        }

    }

}
