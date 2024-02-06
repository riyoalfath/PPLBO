package Praktikum1;

public class MainBankAccount {
    public static void main(String[] args) throws Exception {
        BankAccount b = new BankAccount("001", 1000);
        
        System.out.println(b.getBalance());
        
        b.withdraw(500);
    }
}