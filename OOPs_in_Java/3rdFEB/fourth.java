/*Assignment 4: Smart Home Payment Gateway
Topic: Multiple Inheritance via Interfaces
Objective: Java doesn't support multiple inheritance with classes, but it does with interfaces.
•	Task: 1. Create interface Electronic with consumePower(). 2. Create interface SmartFeature with connectToInternet(). 3. Create a class SmartFridge that implements both interfaces.
•	Implementation: * In consumePower(), calculate power usage based on a "cooling level" variable.
o	In connectToInternet(), simulate a connection by printing the "IP Address" of the fridge.
Goal: Show how a class can take on multiple "behaviors" from different 
Sources */
public class fourth {
    public static void main(String[] args) {

        SmartFridge fridge = new SmartFridge();
        fridge.consumePower();
        fridge.connectToInternet();
    }
}

interface Electronic {
    void consumePower();
}

interface SmartFeature {
    void connectToInternet();
}

class SmartFridge implements Electronic, SmartFeature {

    public void consumePower() {
        int coolingLevel = 5;
        int powerConsumption = coolingLevel * 20;
        System.out.println("Smart Fridge is consuming " +
                powerConsumption + " watts of power.");
    }

    public void connectToInternet() {
        System.out.println("IP Address of the Smart Fridge: 192.168.1.100");
    }
}
