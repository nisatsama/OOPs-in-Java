/*Assignment 3: The Banking Suite
Topic: Method Overriding (Runtime Polymorphism)
Objective: Practice redefining a parent’s method in a child class to provide specific behavior.
•	Task: 1. Create a base class Bank with a method getInterestRate() that returns 0. 2. Create two subclasses: SBI and ICICI. 3. Override the getInterestRate() method in both. SBI should return 5% and ICICI should return 7%.
•	Test: Create objects of both banks and call the method. This illustrates how the same method call produces different results depending on the object type.
*/
package fourth;

public class BankingSuite {
    public static void main(String[] args) {

        Bank obj1 = new SBI();      // Runtime Polymorphism
        System.out.println("SBI Interest Rate: " + obj1.getInterestRate() + "%");

        Bank obj2 = new ICICI();   // Runtime Polymorphism
        System.out.println("ICICI Interest Rate: " + obj2.getInterestRate() + "%");
    }
}

class Bank {
    double getInterestRate() {
        return 0;
    }
}

class SBI extends Bank {
    @Override
    double getInterestRate() {
        return 5.0;
    }
}

class ICICI extends Bank {
    @Override
    double getInterestRate() {
        return 7.0;
    }
}
