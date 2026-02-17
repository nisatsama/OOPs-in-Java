package FEB10th.University.Students;
import FEB10th.University.administration.Staff;
public class Intern extends Staff {
  public void showSalary(){
    System.out.println("Intern Salary: " + salary);
    //System.out.println(bankAccount);
  }
  public static void main(String[] args) {
    Intern i = new Intern();
    i.showSalary();
  }
}
  
