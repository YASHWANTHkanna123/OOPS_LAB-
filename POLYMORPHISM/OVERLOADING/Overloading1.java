/*
Design a Payment system using method overloading where:

User can pay using UPI ID
User can pay using Card number + CVV
User can pay using Account number + IFSC code

Display appropriate payment method used.
*/

class Payment {
    void pay(String upi) {
        System.out.println("paid using UPI: " + upi);
    }

    void pay(long card, int cvv) {
        System.out.println("paid using Card: " + card);
    }

    void pay(long acc, String ifsc) {
        System.out.println("paid using Net Banking: " + acc);
    }
}
class Overloading1 {
    public static void main(String[] args) {
        Payment p = new Payment();
        p.pay("yash@upi");
        p.pay(1234567812345678L, 123);
        p.pay(9876543210L, "SBIN0001234");
    }
}





