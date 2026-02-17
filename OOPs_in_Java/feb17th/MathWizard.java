package feb17th;

class MathWizard {

   
    static int factorial(int n) {
      
        if (n == 0 || n == 1) {
            return 1;
        }

               return n * factorial(n - 1);
    }

    public static void main(String[] args) {

      
        System.out.println("Factorial of 5 = " + factorial(5));

      
        System.out.println("Factorial of -1 = " + factorial(-1));
    }
}

