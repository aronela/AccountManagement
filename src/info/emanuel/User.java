package info.emanuel;

public class User {
    private int id;
    private String nume;
    private AccountManager accountManager;

    public User(int id, String nume) {
        this.id = id;
        this.nume = nume;

        this.accountManager = new AccountManager();
        this.accountManager.createCheckingAccount();
        this.accountManager.createSavingsAccount();
    }

    public void addToChecking(double amount) {
        System.out.println("Add " + amount + " RON to checking");
        accountManager.addMoneyToCheckingAccount(amount);
    }

    public void withdrawChecking(double amount) {
        System.out.println("Withdraw " + amount + " RON from checking");
        accountManager.withdrawFromCheckingAccount(amount);
    }

    public void moveToSavings(double amount) {
        System.out.println("Transfer " + amount + " RON to savings");
        accountManager.transferFromCheckingToSavings(amount);
    }

    public void getSold() {
        System.out.println("Total sold: " + accountManager.getSoldFromAccounts() + " RON");
    }

    public void listBankAccounts() {
        System.out.println("List of all my bank accounts:");
        accountManager.listAllAccounts();
    }

    public void showMyInterestRate() {
        System.out.println("Interest after 3 months: " + accountManager.calculateInterest());
    }
}
