import java.util.Scanner;

class BankAccount{
int accNo=12345;
String name="Yashwanth";
int balance=10000;

void accountDetails(){
System.out.println("Account Number:"+accNo);
System.out.println("Name:"+name);
System.out.println("Balance:"+balance);
}
}

class AtmOperations extends BankAccount{
Scanner sc=new Scanner(System.in);

void deposit(){
System.out.println("Enter amount to deposit:");
int amt=sc.nextInt();
balance=balance+amt;
System.out.println("Amount Deposited:"+amt);
System.out.println("New Balance:"+balance);
}

void withdraw(){
System.out.println("Enter amount to withdraw:");
int amt=sc.nextInt();
if(amt<=balance){
balance=balance-amt;
System.out.println("Amount Withdrawn:"+amt);
System.out.println("Remaining Balance:"+balance);
}
else{
System.out.println("Insufficient Balance");
}
}

void checkBalance(){
System.out.println("Current Balance:"+balance);
}
}

public class Atm{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
AtmOperations obj=new AtmOperations();
int choice;

do{
System.out.println("1.Account Details");
System.out.println("2.Deposit");
System.out.println("3.Withdraw");
System.out.println("4.Check Balance");
System.out.println("5.Exit");
System.out.println("Enter choice:");
choice=sc.nextInt();

switch(choice){
case 1:obj.accountDetails();break;
case 2:obj.deposit();break;
case 3:obj.withdraw();break;
case 4:obj.checkBalance();break;
case 5:System.out.println("Thank you");break;
default:System.out.println("Invalid choice");
}

}while(choice!=5);

}
}