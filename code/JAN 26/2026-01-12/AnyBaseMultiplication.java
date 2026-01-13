import java.util.Scanner;

public class AnyBaseMultiplication {

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

    public static int getProductWithSingleDigit(int b, int num1, int rem2){

        int product = 0;
        int carryValue = 0;
        int placeValue = 1;

        while(num1 > 0 || carryValue > 0){

            int rem1 = num1 % 10;

            int remProduct = (rem1 * rem2) + carryValue;
            int remDigit = remProduct % b;
            carryValue = remProduct / b;

            product += remDigit * placeValue;

            placeValue *= 10;

            num1 /= 10;

        }

        return product;
    }

    public static int anyBaseMultiply(int b, int num1, int num2){
        int finalAns = 0;
        int power = 1;

        while(num2 > 0){
            int rem2 = num2 % 10;
            int interimAns = getProductWithSingleDigit(b, num1, rem2);

            finalAns = anyBaseAddition(b, finalAns, interimAns * power);    // Shifting Power and then Adding
            power *= 10;
            num2 /= 10;
        }

        return finalAns;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the base (<=10): ");
        int b = scanner.nextInt();

        System.out.println("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter second number: ");
        int num2 = scanner.nextInt();

        int ans = anyBaseMultiply(b, num1, num2);

        System.out.print(num1 + " x " + num2 + " in base " + b + " = " + ans);

        scanner.close();
    }
}
