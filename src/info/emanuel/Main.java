package info.emanuel;

public class Main {
    public static void main(String[] args) {

        User ion = new User(1, "ion");

        ion.addToChecking(350);
        ion.moveToSavings(200);
        ion.listBankAccounts();

        ion.withdrawChecking(50);
        ion.getSold();
        ion.showMyInterestRate();
    }
}
