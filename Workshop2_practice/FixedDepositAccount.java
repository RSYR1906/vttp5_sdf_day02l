package Workshop2_practice;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class FixedDepositAccount extends BankAccount {

    private float interest = 3;
    private int months = 6;
    private final float DEFAULT_interest = 3;
    private final int DEAFAULT_months = 6;
    private boolean isInterestChanged;
    private boolean isMonthsChanged;

    public FixedDepositAccount(String accName, float accBalance) {
        super(accName, accBalance);
        this.interest = DEFAULT_interest;
        this.months = DEAFAULT_months;
        isInterestChanged = false;
        isMonthsChanged = false;
    }

    public FixedDepositAccount(String accName, Float accBalance, Float interest) {
        this(accName, accBalance);
        setInterest(interest);
    }

    public FixedDepositAccount(String accName, Float accBalance, Float interest, Integer months) {
        this(accName, accBalance, interest);
        setMonths(months);
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        if (interest <= 0 || isInterestChanged) {
            throw new IllegalArgumentException("Interest cannot be less than 0 or interest can no longer be changed");
        } else {
            this.interest = interest;
            isInterestChanged = true;
        }
    }

    public int getMonths() {
        return months;
    }

    public void setMonths(int months) {
        if (months <= 0 || isMonthsChanged) {
            throw new IllegalArgumentException("Duration cannot be less than 0 or duration can no longer be changed");
        } else {
            this.months = months;
            isMonthsChanged = true;
        }
    }

    public float getDEFAULT_interest() {
        return DEFAULT_interest;
    }

    public int getDEAFAULT_months() {
        return DEAFAULT_months;
    }

    public boolean isInterestChanged() {
        return isInterestChanged;
    }

    public void setInterestChanged(boolean isInterestChanged) {
        this.isInterestChanged = isInterestChanged;
    }

    public boolean isMonthsChanged() {
        return isMonthsChanged;
    }

    public void setMonthsChanged(boolean isMonthsChanged) {
        this.isMonthsChanged = isMonthsChanged;
    }

    @Override
    public void deposit(int amount) {
        System.out.println("Not allowed to deposit!");
    }

    @Override
    public void withdraw(int amount) {
        System.out.println("Not allowed to withdraw!");

    }

    public float getBalance() {
        float balance = ((interest / 100) * months * super.getAccBalance()) + super.getAccBalance();
        return balance;
    }
}
