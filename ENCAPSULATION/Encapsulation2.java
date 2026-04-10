/*
Design a Smart Banking system using encapsulation:

- Private variables:
    accountNumber, balance

- Provide:
    setAccount() → initialize values
    getBalance() → return balance

- Methods:
    deposit(amount):
        if amount > 0 → add to balance
        else → print invalid

    withdraw(amount):
        if amount <= balance:
            if amount > 3000 → charge 50 extra fee
            deduct amount
        else → insufficient balance

    checkMinimumBalance():
        if balance < 1000 → warning message

- Display updated balance after every operation
*/

class Bank {
    private int accNo;
    private double balance;

    void setAccount(int a, double b) {
        accNo = a;
        balance = b;
    }

    double getBalance() {
        return balance;
    }

    void deposit(double amt) {
        if (amt > 0) {
            balance = balance + amt;
            System.out.println("deposited " + amt);
        } else {
            System.out.println("invalid deposit");
        }
        System.out.println("balance: " + balance);
    }

    void withdraw(double amt) {
        if (amt <= balance) {
            if (amt > 3000) {
                balance = balance - amt - 50;
                System.out.println("extra Charge 50 Applied");
            } else {
                balance = balance - amt;
            }
            System.out.println("withdrawn: " + amt);
        } else {
            System.out.println("insufficient Balance");
        }
        System.out.println("balance: " + balance);
    }

    void checkMinimumBalance() {
        if (balance < 1000) {
            System.out.println("warning: minimum balance low");
        }
    }
}

class Encapsulation2 {
    public static void main(String[] args) {
        Bank b = new Bank();

        b.setAccount(201, 4000);

        b.deposit(2000);
        b.deposit(-100);

        b.withdraw(3500);
        b.withdraw(5000);

        b.checkMinimumBalance();
    }
}

