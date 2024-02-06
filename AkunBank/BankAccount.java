package Praktikum1;

class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;

    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Tarik " + amount + ". Sisa: " + balance);
        } else {
            System.out.println("Tidak bisa ditarik. Dana tidak cukup.");
        }
    }

    public double getBalance() {
        return balance;
    }
}