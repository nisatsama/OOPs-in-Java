/*Assignment 2: Personnel Management System
Topic: Single Inheritance
Objective: Understand the "is-a" relationship by creating a base class and a specialized derived class.
•	Task: Create a class Person with name and age, then a subclass Employee that adds employeeId and salary.
•	Logic: Use the super keyword in the Employee constructor to pass data up to the Person constructor.
 */
package fourth;

public class Main {
  public static void main(String[] args) {
    Employee e = new Employee("Nisat", 19, 1001, 90000);
    e.displayEmployee();
  }
}
class Person{
  String name;
  int age;

  Person(String name,int age){
    this.name=name;
    this.age = age;
  }
  void displayPerson(){
    System.out.println("Name : "+name);
    System.out.println("Age : "+age);
  }
}
 class Employee extends Person{
  int employeeId;
  double salary;

  Employee(String name,int age,int employeeId,double salary){
    super(name, age);
    this.employeeId=employeeId;
    this.salary = salary;
  }
  void displayEmployee(){
    displayPerson();
    System.out.println("Employee ID : "+ employeeId);
    System.out.println("Salary : "+ salary);
  }
 }