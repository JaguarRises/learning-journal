import java.util.Scanner;

public class AnyBaseDifference {

    public static int anyBaseDifference(int b, int num1, int num2){

        int diff = 0;
        int placeValue = 1;
        int borrow = 0;

        while(num1 > 0 || num2 > 0){

            int rem1 = num1 % 10;
            int rem2 = num2 % 10;

            rem2 = rem2 - borrow;

            if(rem2 < rem1){    //remDiff < 0
                rem2 = rem2 + b;
                borrow = 1;
            }else{
                borrow = 0;
            }

            int remDiff = rem2 - rem1;

            diff += remDiff * placeValue;
            placeValue *= 10;

            num1 /= 10;
            num2 /= 10;
        }

        return diff;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the base (<=10): ");
        int b = scanner.nextInt();

        System.out.println("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter second number: (greater than first) ");
        int num2 = scanner.nextInt();

        int ans = anyBaseDifference(b, num1, num2);

        System.out.print(num2 + " - " + num1 + " in base " + b + " = " + ans);

        scanner.close();
    }
}
