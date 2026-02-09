import java.util.Scanner;
public class CaseStudy1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number from menu");
        int choice = sc.nextInt();
        int seats = 10;
        boolean isBooked = false;
        switch (choice) {
            case 1:
                if (seats > 0) {
                    System.out.println("booking is success");
                    isBooked = true;
                } else {
                    System.out.println("seats are not available");
                }
                break;
            case 2:
                if (isBooked) {
                    System.out.println("ticket is cancelled");
                } else {
                    System.out.println("cancellation is failed no confirm tickets");
                }
                break;
            case 3:
                System.out.println("checking status");
                break;
            case 4:
                System.out.println("exiting");
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}