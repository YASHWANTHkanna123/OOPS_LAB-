interface Payment {
    double MAX_LIMIT = 100000;
    void processPayment(double a);
    void generateReceipt();
}
class UPI implements Payment {
    private final String id;
    UPI(String id) {
        this.id = id;
    }
    public void processPayment(double a) {
        if (a > MAX_LIMIT)
            System.out.println("Limit exceeded");
        else
            System.out.println("UPI " + a + " " + id);
    }
    public void generateReceipt() {
        System.out.println("UPI Receipt");
    }
}
class Card implements Payment {
    private final String no;
    Card(String no) {
        this.no = no;
    }
    public void processPayment(double a) {
        if (a > MAX_LIMIT)
            System.out.println("Limit exceeded");
        else
            System.out.println("Card " + a + " " + no);
    }
    public void generateReceipt() {
        System.out.println("Card Receipt");
    }
}
public class Main {
    public static void main(String[] args) {
        UPI u = new UPI("abc@upi");
        u.processPayment(5000);
        u.generateReceipt();
        Card c = new Card("1234");
        c.processPayment(150000);
        c.generateReceipt();
    }
}