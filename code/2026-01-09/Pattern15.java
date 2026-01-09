import java.util.Scanner;

/*
    1
  2 3 2
3 4 5 4 3
  2 3 2
    1
 */

public class Pattern15 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows (must be odd): ");
        int n = scanner.nextInt();

        int outerSpace = n/2;
        int numberOfValues = 1;
        int rowFirst = 1;

        for(int i = 1; i <= n; i++){

            int val = rowFirst;

            for(int j = 1; j <= outerSpace; j++) {
                System.out.print("  ");
            }

            for(int k = 1; k <= numberOfValues; k++){
                System.out.print(val + " ");
                if(k <= numberOfValues/2){
                    val++;
                }else{
                    val--;
                }
            }

            if(i <= n/2){
                outerSpace--;
                numberOfValues += 2;
                rowFirst++;
            }else{
                outerSpace++;
                numberOfValues -= 2;
                rowFirst--;
            }

            if(i != n){
                System.out.println();
            }
        }

        scanner.close();
    }
}
