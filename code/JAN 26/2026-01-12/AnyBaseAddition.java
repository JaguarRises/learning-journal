import java.util.Scanner;

public class AnyBaseAddition {

    public static int anyBaseAddition(int b, int num1, int num2){

        int sum = 0;
        int placeValue = 1;
        int carryValue = 0;

        while(num1 > 0 || num2 > 0 || carryValue > 0){

            int rem1 = num1 % 10;
            int rem2 = num2 % 10;

            int remSum = rem1 + rem2 + carryValue;  // Carry is also added

            carryValue = remSum / b;    //Quotient
            remSum = remSum % b;        //Remainder

            sum += remSum * placeValue;
            placeValue *= 10;

            num1 /= 10;
            num2 /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the base (<=10): ");
        int b = scanner.nextInt();

        System.out.println("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter second number: ");
        int num2 = scanner.nextInt();

        int ans = anyBaseAddition(b, num1, num2);

        System.out.print(num1 + " + " + num2 + " in base " + b + " = " + ans);

        scanner.close();
    }
}
