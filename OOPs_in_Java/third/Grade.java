 //Write a Java program to check grade of marks using switch case.
 package third;

  import java.util.Scanner;

  public class Grade {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the marks obtained (0-100) : ");
      int marks = sc.nextInt();

      switch (marks/10) {
        case  10:
        case 9:
          System.out.println("Grade: A");
          break;
        case 8:
          System.out.println("Grade: B");
          break;
        case 7:
          System.out.println("Grade: C");
          break;
        case 6:
          System.out.println("Grade: D");
          break;
      
        default:
          if(marks>=0){
            System.out.println("Grade: F");
          }
          else{
            System.out.println("Invalid Marks!");
          }
          break;
      }

      sc.close();
    }
  }
