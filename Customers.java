public class Customers {
    private int accountNumber;
    private String customerName;
    private String accountType;
    private double accountBalance;

    public Customers(int accountNumber, String customerName, String accountType, double accountBalance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }

    @Override
    public String toString() {
        return accountNumber + " " + customerName + " " + accountType + " Rs. " + accountBalance;
    }

    // Calculate the interest amount based on account balance
    public double calculateInterest() {
        double interestRate;
        if (accountBalance < 250000) {
            interestRate = 2.5;
        } else if (accountBalance < 500000) {
            interestRate = 5.0;
        } else if (accountBalance < 750000) {
            interestRate = 7.5;
        } else if (accountBalance < 1000000) {
            interestRate = 8.0;
        } else if (accountBalance < 1500000) {
            interestRate = 9.5;
        } else {
            interestRate = 0.0; // optional
        }
        return accountBalance * (interestRate / 100);
    }

    // Calculate the total balance after adding interest
    public double calculateTotalBalance() {
        return accountBalance + calculateInterest();
    }
}