/*
Design a Smart E-Commerce Billing system using method overriding:

- Base class Order:
    method bill(int amount) → displays base amount

- Derived class PremiumOrder:
    overrides bill()

Rules:
1. If user is premium member:
    - amount > 8000 → 25% discount
    - amount > 4000 → 15% discount
    - else → 5% discount

2. If user is NOT premium:
    - amount > 8000 → 10% discount
    - amount > 4000 → 5% discount
    - else → no discount

3. If final amount > 5000 → free delivery
   else → add delivery charge 100

4. Use super keyword to show original bill

5. Display:
   - user type
   - discount applied
   - delivery status
   - final amount
*/

class Order {
    void bill(int amount) {
        System.out.println("Original Amount: " + amount);
    }
}
class PremiumOrder extends Order {
    boolean isPremium = true;
    void bill(int amount) {
        super.bill(amount);

        int finalAmount = amount;
        int discount = 0;
        if (isPremium) {
            System.out.println("User: Premium");

            if (amount > 8000) {
                discount = 25;
            } else if (amount > 4000) {
                discount = 15;
            } else {
                discount = 5;
            }
        } else {
            System.out.println("User: Normal");

            if (amount > 8000) {
                discount = 10;
            } else if (amount > 4000) {
                discount = 5;
            } else {
                discount = 0;
            }
        }

        finalAmount = amount - (amount * discount / 100);
        System.out.println("discount Applied: " + discount + "%");

        if (finalAmount > 5000) {
            System.out.println("free Delivery");
        } else {
            finalAmount = finalAmount + 100;
            System.out.println("delivery Charge Added: 100");
        }

        System.out.println("final Amount: " + finalAmount);
        System.out.println("----------------------");
    }
}
 public class Overidding2 {
    public static void main(String[] args) {
        PremiumOrder p = new PremiumOrder();
        p.bill(9000);
        p.bill(5000);
        p.bill(2000);
        p.isPremium = false;
        p.bill(9000);
        p.bill(5000);
        p.bill(2000);
    }
}
