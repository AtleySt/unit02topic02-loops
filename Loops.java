import java.util.Arrays;

public class Loops {

  // static methods go here
  public static void nHellos(int n) {
    for (int index = 1; index < n; index++) {
      if (index % 100 == 11 || index % 100 == 12 || index % 100 == 13) {
        System.out.println(index+"th hello");
      } else if (index % 10 == 1) {
        System.out.println(index+"st hello");
      } else if (index % 10 == 2) {
        System.out.println(index+"nd hello");
      } else if (index % 10 == 3) {
        System.out.println(index+"rd hello");
      } else {
        System.out.println(index+"th hello");
      }
      }
    }

    public static double nRandoms(int n) {
      double ave = 0;
      for (int index = 0; index < n; index++) {
        ave += Math.random();
      }
      ave = ave / n;
      return ave;
    }

    public static boolean isPrime(int n) {
      for (int index = 2; index < n; index++) {
        if (n % index == 0) {
          return false;
        }
      }
      return true;
    }
    
    public static int[] getFactors(int n) {
      int numberOfFactors = 0;
      for (int index = 1; index <= n; index++) {
        if (n % index == 0){
          numberOfFactors++;
        }
      }
      int[] factors = new int[numberOfFactors];
      int count = 0;
      for (int index = 1; index <= n; index++) {
        if (n % index == 0){
          factors[count] = index;
          count++;
        }
      }
      return factors;
    }
    public static void main(String[] args) {

      // testing of static methods goes here
  
      // nHellos(125);
      // System.out.println(nRandoms(3));
      // System.out.println(isPrime(59));
      System.out.println(Arrays.toString(getFactors(24)));
    }
  }

  