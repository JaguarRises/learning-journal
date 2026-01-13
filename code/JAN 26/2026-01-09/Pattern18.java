import java.util.Scanner;
/*
0 0 0 0 0 0 0
  0       0
    0   0
      0
    0 0 0
  0 0 0 0 0
0 0 0 0 0 0 0
*/

public class Pattern18 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows ");
        int n = scanner.nextInt();

        int noOfStars = n;
        int outerSpaces = 0;

        for(int i = 1; i <= n; i++){

            for(int k = 1; k <= outerSpaces; k++){
                System.out.print("  ");
            }

            for(int j = 1; j <= noOfStars; j++){

                if(i != 1 && i <= (n/2) && j != 1 && j != noOfStars){
                    System.out.print("  ");
                }else{
                    System.out.print("0 ");
                }

            }

            if(i <= n/2){
                noOfStars -= 2;
                outerSpaces++;
            }else{
                noOfStars += 2;
                outerSpaces--;
            }

            if(i != n){
                System.out.println();
            }
        }

        scanner.close();
    }
}

