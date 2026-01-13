import java.util.Scanner;

public class AnyBaseToAnyBase {

    public static int baseConverter (int n, int b1, int b2){
    // Can use two different functions as well
        int temp = n;

        int toBase = 0;
        int toDecimal = 0;

        int powerB1 = 1;
        int powerB2 = 1;
        // Converting to Decimal
        while(temp > 0){

            int rem = temp % 10;
            temp = temp / 10;

            toDecimal = toDecimal + (rem * powerB1);
            //System.out.println("toDecimal: " + toDecimal);
            powerB1 *= b1;
        }

        if(b2 == 10){
            return toDecimal;
        }
        else{
            // Converting Decimal to Base
            while(toDecimal > 0){

                int rem = toDecimal % b2;

                toBase += (rem * powerB2);
                //System.out.println("toBase: " + toBase);

                toDecimal = toDecimal / b2;
                powerB2 *= 10;
            }
        }

        return toBase;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n = scanner.nextInt();

        System.out.println("Enter the base: ");
        int b1 = scanner.nextInt();

        System.out.println("Enter the base in which you want to convert: ");
        int b2 = scanner.nextInt();

        int ans = baseConverter(n, b1, b2);

        System.out.print(n + " of base " + b1 + " is " + ans + " in base " + b2);

        scanner.close();
    }
}
