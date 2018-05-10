package info.emanuel;

public class BankAccount {
    private String iban;
    private double sold;
    private String currency;
    private double interest;

    public BankAccount(String iban, double sold, String currency, double interest) {
        this.iban = iban;
        this.sold = sold;
        this.currency = currency;
        this.interest = interest;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public double getSold() {
        return sold;
    }

    public void setSold(double sold) {
        this.sold = sold;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }
}
