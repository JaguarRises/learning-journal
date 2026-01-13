import java.util.Scanner;
/*
0 0 0 0     0
      0     0
      0     0
0 0 0 0 0 0 0
0     0
0     0
0     0 0 0 0
 */


public class Pattern19 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows: (Must be ODD)");
        int n = scanner.nextInt();
        int mid = n/2 + 1;

        for(int i = 1; i <= n; i++){
            if(i == 1){

                for(int j = 1; j <= n; j++){
                    if(j <= mid || j == n){
                        System.out.print("0 ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
            }
            else if(i < mid){
              for(int j = 1; j <= n; j++){
                  if(j == mid || j == n){
                      System.out.print("0 ");
                  }
                  else{
                      System.out.print("  ");
                  }
              }
            }
            else if(i == mid){
                for(int j = 1; j <= n; j++){
                    System.out.print("0 ");
                }
            }
            else{
                if(i == n){
                    for(int j = 1; j <= n; j++){
                        if(j == 1 || j >= mid){
                            System.out.print("0 ");
                        }
                        else{
                            System.out.print("  ");
                        }
                    }
                }
                else{
                    for(int j = 1; j <= n; j++){
                        if(j == 1 || j == mid){
                            System.out.print("0 ");
                        }
                        else{
                            System.out.print("  ");
                        }
                    }
                }

            }

            if(i != n){
                System.out.println();
            }

        }
        scanner.close();
    }
}
