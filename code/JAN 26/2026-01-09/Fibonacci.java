import java.util.Scanner;

public class Fibonacci {

    public static void printFibonacci(int n){

        int first = 0;
        int second = 1;

        for(int i = 1; i <= n; i++){
            System.out.println(first);
            int sum = first + second;
            first = second;
            second = sum;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of terms: ");
        int num = scanner.nextInt();

        printFibonacci(num);

        scanner.close();

    }
}
