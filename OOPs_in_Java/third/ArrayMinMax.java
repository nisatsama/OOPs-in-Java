 //Write a program in Java to find the largest and the smallest number in an array. Use class and methods concept.
 package third;

  public class ArrayMinMax {
    
      public static void main(String[] args) {
          int arr[] = {99, 56, 34, 11, 78, 82, 47, 10};

          ArrayMinMax obj = new ArrayMinMax();

          System.out.println("Maximum number is: " + obj.maxNum(arr));
          System.out.println("Minimum number is: " + obj.minNum(arr));
      }

      int maxNum(int arr[]) {
          int max = arr[0];
          for (int i = 1; i < arr.length; i++) {
              max = Math.max(max, arr[i]);
          }
          return max;
      }

      int minNum(int arr[]) {
          int min = arr[0];
          for (int i = 1; i < arr.length; i++) {
              min = Math.min(min, arr[i]);
          }
          return min;
      }
  }


