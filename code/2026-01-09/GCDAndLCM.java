import java.util.Scanner;

public class GCDAndLCM {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        if(num1 == 0 || num2 == 0){
            System.out.println("Number cannot be 0");
            return;
        }

        // Euclid's Method
        int dividend = Math.abs(num1);  // Only For Positive
        int divisor = Math.abs(num2);   // Auto Adjusts for whichever is greater

        int gcd = 1;

        while(divisor > 0){
            // Long Division
            int remainder = dividend % divisor;

            dividend = divisor;
            divisor = remainder;
        }

        gcd = dividend; // Last Divisor before remainder is 0

        int lcm = Math.abs((num1 * num2)/gcd);      // num1 * num2 = gcd * lcm

        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);

        scanner.close();
    }
}
