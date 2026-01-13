import java.util.Scanner;

/*
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
1 5 10 10 5 1
*/


public class Pattern13 {
/*

    public static int factN(int n){
        int factorial = 1;
        for(int i = 2; i <= n; i++){
            factorial *= i;
        }

        return factorial;
    }

*/
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int n = scanner.nextInt();

        for(int i = 0; i < n; i++){

            int iCj = 1;

            for(int j = 0; j <= i; j++){

               // int ans = (factN(i)/ (factN(i - j) * factN(j)));

                int iCjp1 = (iCj * (i - j))/(j+1);  // nCr+1 = (nCr * (n-r)) / (r+1)
                System.out.print(iCj + " ");
                iCj = iCjp1;
            }
            if(i != n-1){
                System.out.println();
            }
        }
        scanner.close();
    }
}
