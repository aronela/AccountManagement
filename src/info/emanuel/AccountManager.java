package info.emanuel;

import java.util.ArrayList;
import java.util.List;

public class AccountManager {
    private BankAccount checkingAccount;
    private BankAccount savingsAccount;

    public void createCheckingAccount()
    {
        this.checkingAccount = new BankAccount("RO123456", 0, "RON", 1.0);
    }

    public void createSavingsAccount()
    {
        this.savingsAccount = new BankAccount("RO456789", 0, "RON", 1.5);
    }

    public void addMoneyToCheckingAccount(double amount)
    {
        this.checkingAccount.setSold( this.checkingAccount.getSold() + amount );
    }

    public void addMoneyToSavingsAccount(double amount)
    {
        this.savingsAccount.setSold( this.savingsAccount.getSold() + amount );
    }

    public void withdrawFromCheckingAccount(double amount)
    {
        this.checkingAccount.setSold( this.checkingAccount.getSold() - amount );
    }

    public void withdrawFromSavingsAccount(double amount)
    {
        this.savingsAccount.setSold( this.savingsAccount.getSold() - amount );
    }

    public void transferFromCheckingToSavings(double amount)
    {
        this.withdrawFromCheckingAccount(amount);
        this.addMoneyToSavingsAccount(amount);
    }

    public void transferFromSavingsToChecking(double amount)
    {
        this.withdrawFromSavingsAccount(amount);
        this.addMoneyToCheckingAccount(amount);
    }

    public double getSoldFromAccounts()
    {
        return this.checkingAccount.getSold() + this.savingsAccount.getSold();
    }

    public void listAllAccounts()
    {
        System.out.println("Checking account: " + this.checkingAccount.getIban()
                + " | Sold: " + this.checkingAccount.getSold()
                + " " + this.checkingAccount.getCurrency());

        System.out.println("Savings account: " + this.savingsAccount.getIban()
                + " | Sold: " + this.savingsAccount.getSold()
                + " " + this.savingsAccount.getCurrency());
    }

    public String calculateInterest()
    {
        return (this.savingsAccount.getSold() * this.savingsAccount.getInterest() / 100)
                + " " + this.savingsAccount.getCurrency();
    }
}
