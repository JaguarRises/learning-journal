/*

 1 1 1 0 1 1 1
 1 1 0 0 0 1 1
 1 0 0 0 0 0 1
 1 1 0 0 0 1 1
 1 1 1 0 1 1 1

 */

import java.util.Scanner;

public class Pattern6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows (Must be Odd): ");
        int n = scanner.nextInt();

        int nOnes = (int) n/2 + 1;
        int nZeroes = 1;

        for(int i = 1; i <= n; i++){

            for(int j = 1; j <= nOnes; j++){
                System.out.print("1 ");
            }

            for(int k = 1; k <= nZeroes; k++){
                System.out.print("0 ");
            }

            for(int j = 1; j <= nOnes; j++){
                System.out.print("1 ");
            }

            if( i <= n/2){
                nOnes--;
                nZeroes += 2;
            }
            else{
                nOnes++;
                nZeroes -= 2;
            }

            if( i != n){
                System.out.println();
            }
        }
        scanner.close();
    }
}

