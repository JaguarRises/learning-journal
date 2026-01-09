import java.util.Scanner;
/*
0 0 0 1 0 0 0
0 0 1 0 1 0 0
0 1 0 0 0 1 0
1 0 0 0 0 0 1
0 1 0 0 0 1 0
0 0 1 0 1 0 0
0 0 0 1 0 0 0
 */

public class Pattern10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows (Must be Odd): ");
        int n = scanner.nextInt();

        int outerZeroes = n/2;
        int innerZeroes = -1;

        for(int i = 1; i <= n; i++){

            for(int j = 1; j <= outerZeroes; j++){
                System.out.print("0 ");
            }

            System.out.print("1 ");

            for(int k = 1; k <= innerZeroes; k++){
                System.out.print("0 ");
            }

            if(i != 1 && i != n){
                System.out.print("1 ");
            }

            for(int j = 1; j <= outerZeroes; j++){
                System.out.print("0 ");
            }

            if(i <= n/2){
                outerZeroes--;
                innerZeroes += 2;
            }
            else{
                outerZeroes++;
                innerZeroes -= 2;
            }
            if(i != n){
                System.out.println();
            }
        }

        scanner.close();
    }
}
