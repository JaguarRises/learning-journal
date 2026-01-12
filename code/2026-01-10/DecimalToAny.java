import java.util.Scanner;

public class DecimalToAny {

    public static int convertBase(int n, int b){

        int newNum = 0;
        int placeValue = 1;

        while( n > 0){
            int rem = n % b;
            newNum = newNum + rem * placeValue;

            placeValue *= 10;
            n = n / b;
        }
        return newNum;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scanner.nextInt();

        System.out.println("Enter the base: ");
        int base = scanner.nextInt();

        int ans = convertBase(num, base);

        System.out.println(num + " in base " + base + " is: " + ans);

        scanner.close();
    }
}

/*  For Bases > 10 - Treat them as strings
import java.util.Scanner;

public class DecimalToAny {

    public static String convertBase(int n, int b){

        String newNum = "";    // Outputting Strings instead of Number
        int placeValue = 0;   // kept for similarity, not required

        while(n > 0){
            int rem = n % b;

            if(rem < 10){
                newNum = rem + newNum;
            }else{
                newNum = (char)('A' + rem - 10) + newNum;
            }

            n = n / b;
            placeValue++;
        }
        return newNum;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = scanner.nextInt();

        System.out.println("Enter the base: ");
        int base = scanner.nextInt();

        String ans = convertBase(num, base);

        System.out.println(num + " in base " + base + " is: " + ans);

        scanner.close();
    }
}

 */
