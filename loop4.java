import java.util.Scanner;
class loop4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance= 20000;
        int amt;
        int count;
        int choice;
        int amount;
        do { 
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice= sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("the current balance is "+balance);
                    break;
                case 2:
                    System.out.println("enter the amount to be deposited");
                    amt= sc.nextInt();
                    balance= balance+amt;
                    System.out.println("the amount of "+amt+" is deposited");
                    break;
                case 3:
                    System.out.print("enter the amount to withdraw ");
                    amount = sc.nextInt();
                    if (amount > 0 && amount <= balance) {
                        balance = balance - amount;
                        System.out.println("₹" + amount + " withdrawn successfully");
                    } else {
                        System.out.println("insufficent balance");
                    }
                    break;
                case 4:
                    System.out.println("thanks for using atm");
                    break;
                default:
                    System.out.println("invalid choice try again please");        
            }    
        }while(choice!=4);
    }
}
