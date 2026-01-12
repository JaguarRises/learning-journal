import java.util.Scanner;

public class AnyToDecimal {

    public static int decimalConverter(int n, int b){

        int sum = 0;
        int power = 1;
        while(n > 0){
            int rem = n % 10;
            n = n / 10;
            sum += rem * power;
            power *= b;
        }
    return sum;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = scanner.nextInt();
        System.out.println("Enter the base");
        int b = scanner.nextInt();

        int ans = decimalConverter(n, b);

        System.out.println(n + " is " + ans + " in Decimals");

        scanner.close();
    }
}
/*
import java.util.Scanner;

public class AnyToDecimal {

    public static int decimalConverter(String n, int b){

        int sum = 0;
        int power = 1;

        for(int i = n.length() - 1; i >= 0; i--){
            char ch = n.charAt(i);

            int rem;
            if(ch >= '0' && ch <= '9'){
                rem = ch - '0';
            }else{
                rem = ch - 'A' + 10;
            }

            sum += rem * power;
            power *= b;
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number: ");
        String n = scanner.next();

        System.out.println("Enter the base: ");
        int b = scanner.nextInt();

        int ans = decimalConverter(n, b);

        System.out.println(n + " in decimal is: " + ans);

        scanner.close();
    }
}

 */
