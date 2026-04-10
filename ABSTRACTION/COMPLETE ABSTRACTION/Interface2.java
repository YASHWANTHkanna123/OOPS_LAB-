interface SmartDevice {
    int VOLTAGE = 220;  // public static final
    void turnOn();
    void turnOff();
}
class Fan implements SmartDevice {
    private final String deviceName;
    Fan(String deviceName) {
        this.deviceName = deviceName;
    }
    public void turnOn() {
        System.out.println(deviceName + " Fan is ON at " + VOLTAGE + "V");
    }
    public void turnOff() {
        System.out.println(deviceName + " Fan is OFF");
    }
}
class Light implements SmartDevice {
    private final String deviceName;
    Light(String deviceName) {
        this.deviceName = deviceName;
    }
    public void turnOn() {
        System.out.println(deviceName + " Light is ON at " + VOLTAGE + "V");
    }
    public void turnOff() {
        System.out.println(deviceName + " Light is OFF");
    }
}
public class Interface2 {
    public static void main(String[] args) {
        Fan fan = new Fan("Living Room");
        fan.turnOn();
        fan.turnOff();
        Light light = new Light("Bedroom");
        light.turnOn();
        light.turnOff();
    }
}