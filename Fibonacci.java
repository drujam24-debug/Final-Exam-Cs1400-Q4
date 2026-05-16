import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        int n = scanner.nextInt();
        
        int result = fibonacciR(n);
        System.out.println("Fibonacci(" + n + ") is " + result + ".");
        
        scanner.close();
    }

    public static int fibonacciR(int n) {
        
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
  
        return fibonacciR(n - 1) + fibonacciR(n - 2);
    }
}
