 //Write a Java program to demonstrate the three looping blocks in Java , each in a differnt function with a different return type.
 package second;
  public class loop {

      public static void main(String[] args) {
          loop demo = new loop();

          
          int sum = demo.first(5);
          System.out.println("Sum of first 5 numbers (for loop): " + sum);

        
          boolean found = demo.second(3);
          System.out.println("Target found (while loop): " + found);

          
          String sequence = demo.third(4);
          System.out.println("Formatted sequence (do-while loop): " + sequence);
      }

    
      public int first(int limit) {
          int total = 0;
          for (int i = 1; i <= limit; i++) {
              total += i;
          }
          return total;
      }

      
      public boolean second(int target) {
          int count = 0;
          while (count < 10) {
              if (count == target) {
                  return true; 
              }
              count++;
          }
          return false;
      }

    
      public String third(int count) {
          String result = "Start-";
          int i = 1;
          do {
              result += i + "-";
              i++;
          } while (i <= count);
          
          return result + "End";
      }
  }