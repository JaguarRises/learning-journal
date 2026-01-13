import java.util.Scanner;

public class BenjaminBulbs {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of bulbs: ");
        int n = scanner.nextInt();

        // Logic 1
        System.out.println("Perfect Squares Logic");
        for(int i = 1; i * i <= n; i++){
            // Perfect Squares
            System.out.print((i * i) + " ");
        }
        System.out.println();
        // Logic 2
        System.out.println("Factors Count Logic");
        for(int i = 1; i <= n; i++){
            // Bulb number with ODD number of factors will be switched ON at last
            // Perfect Squares have ODD number of factors
            int count = 0;
            for(int j = 1; j <= i; j++){
                if(i % j == 0){
                    count++;
                }
            }
            if(count % 2 != 0){
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }
}
