/*Topic: Interfaces (Multiple Implementation)
Objective: Understand how an interface defines a contract that multiple unrelated classes can follow.
•	Task: 1. Define an interface RemoteControl with methods powerOn(), powerOff(), and volumeUp(). 2. Create a class Television that implements RemoteControl. 3. Create a class AudioSystem that implements RemoteControl.
•	Logic: Provide specific print statements in each class (e.g., "TV screen is glowing," "Audio speakers are booming").
•	Goal: Demonstrate how a single interface type can hold objects of different classes (Polymorphism).
 */
public class second {
    public static void main(String[] args) {

        RemoteControl rc = new Television();
        rc.powerOn();
        rc.volumeUp();
        rc.powerOff();

        System.out.println("Remote Control operations completed.");

        rc = new AudioSystem();
        rc.powerOn();
        rc.volumeUp();
        rc.powerOff();

        System.out.println("Remote Control operations completed.");
    }
}

interface RemoteControl {
    void powerOn();
    void powerOff();
    void volumeUp();
}

class Television implements RemoteControl {

    public void powerOn() {
        System.out.println("Television is turned ON.");
    }

    public void powerOff() {
        System.out.println("Television is turned OFF.");
    }

    public void volumeUp() {
        System.out.println("Volume is increased.");
    }
}

class AudioSystem implements RemoteControl {

    public void powerOn() {
        System.out.println("Audio System is turned ON.");
    }

    public void powerOff() {
        System.out.println("Audio System is turned OFF.");
    }

    public void volumeUp() {
        System.out.println("Volume is increased.");
    }
}
