import java.util.Scanner;

public class PrimeFactorization {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        System.out.println("Prime Factorization of " + num + " is: ");

        int dividend = num;

        for(int div = 2; div * div <= dividend; div++){
            // When div is composite, all of its prime factors are already removed earlier
            // Hence no need to check for Prime
            while(dividend % div == 0){
                dividend /= div;
                System.out.print(div + " ");
            }
        }
        if(dividend != 1){
            // If any prime factor is not removed before sqrt(n), then it is the last prime number
            System.out.print(dividend);
        }

        scanner.close();
    }
}
