import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
    
        int num = scnr.nextInt();
        
        int result = fibonacciR(num);
        System.out.println("Fibonacci(" + num + ") is " + result + ".");
        
        scnr.close();
    }

    public static int fibonacciR(int num) {
        
        if (num == 0) {
            return 0;
        }
        if (num == 1) {
            return 1;
        }
  
        return fibonacciR(num - 1) + fibonacciR(num - 2);
    }
}
