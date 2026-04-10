/*
Create a FoodOrder system where:

User can order by item name
User can order by item name + quantity
User can order by item name + quantity + delivery type (normal/fast)

Display appropriate order details.
*/

class FoodOrder {
    void order(String item) {
        System.out.println("ordered: " + item);
    }

    void order(String item, int qty) {
        System.out.println("ordered: " + item + " Qty: " + qty);
    }

    void order(String item, int qty, String type) {
        System.out.println("ordered: " + item + " Qty: " + qty + " Delivery: " + type);
    }
}
class Overloading2 {
    public static void main(String[] args) {
        FoodOrder f = new FoodOrder();
        f.order("Burger");
        f.order("Pizza", 2);
        f.order("Sandwich", 3, "Fast");
    }
}


