public class BankAccount {
    //  step 1 : make variables private ( data hiding )
    private int accountNumber;
    private double balance;

    // Constructor to initialize account details
    public BankAccount() {
        this.accountNumber = 0;
        this.balance = 0.0;
    }

    //  step 2 : setter method for balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    //  step 3 : setter method for accountNumber
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    //  step 4 : Getter method for accountNumber
    public int getAccountNumber() {
        return accountNumber;
    }

    // step 5: Getter method for balance
    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        // step 6: Create object and set values using setter method
        BankAccount account = new BankAccount();
        account.setAccountNumber(12345);
        account.setBalance(5000.00);

        // step 7: Access values using getter method
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Account Balance: " + account.getBalance());
    }
}