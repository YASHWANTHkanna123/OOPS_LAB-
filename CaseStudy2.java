import java.util.Scanner;
public class CaseStudy2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the no of items ");
        int n = sc.nextInt();
        double finalTotal = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("enter the item name ");
            String name = sc.next();
            System.out.print("enter the price ");
            double price = sc.nextDouble();
            System.out.print("enter quantity ");
            int qty = sc.nextInt();
            double itemTotal = price * qty;
            System.out.println("item total " + itemTotal);
            finalTotal += itemTotal;
        }
        System.out.println("Final Bill: " + finalTotal);
    }
}



