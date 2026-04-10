/*
Design a Bank Account system using encapsulation:

- Keep accountNumber and balance as private
- Provide setter to set account details
- Provide getter to display details
- Provide method to deposit amount
*/

class BankAccount {
    private int accNo;
    private double balance;

    void setDetails(int a, double b) {
        accNo = a;
        balance = b;
    }

    int getAccNo() {
        return accNo;
    }

    double getBalance() {
        return balance;
    }

    void deposit(double amt) {
        balance = balance + amt;
    }
}

class Encapsulation1 {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.setDetails(101, 5000);
        b.deposit(2000);

        System.out.println("Account No: " + b.getAccNo());
        System.out.println("Balance: " + b.getBalance());
    }
}


