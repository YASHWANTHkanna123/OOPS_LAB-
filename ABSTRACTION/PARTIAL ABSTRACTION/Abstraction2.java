/* Case Study: Smart Home Automation System
Question: Implement partial abstraction to manage different home appliances. 
The base class should handle common branding and status, while subclasses 
define specific operation logic.
*/

abstract class Appliance {
    String brand = "HomeShield";

    abstract void operate();

    void showStatus() {
        System.out.println("System Check: " + brand + " device is connected.");
    }
}

class SmartLight extends Appliance {
    int brightness = 75;

    void operate() {
        System.out.println("The light is shining at " + brightness + "% brightness.");
    }
}

class SmartAC extends Appliance {
    int temperature = 22;

    void operate() {
        System.out.println("The AC is cooling the room to " + temperature + " degrees.");
    }
}

public class Abstraction2 {
    public static void main(String[] args) {
        SmartLight livingRoomLight = new SmartLight();
        livingRoomLight.showStatus();
        livingRoomLight.operate();

        System.out.println("---");

        SmartAC bedroomAC = new SmartAC();
        bedroomAC.showStatus();
        bedroomAC.operate();
    }
}