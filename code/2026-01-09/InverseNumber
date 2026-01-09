import java.util.*;
public class InverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int temp = n;
        int placeValue = 1;
        int inverseNum = 0;
        while(temp != 0){
            int rem = temp % 10;
            inverseNum += (int) Math.pow(10, rem - 1) * placeValue;

            /*
            Can use Loop to avoid Math.pow as it is double and there can be errors while conversion
            int multiplier = 1;
            for (int i = 1; i < digit; i++) {
                multiplier *= 10;
            }
            */
            temp = temp/10;
            placeValue++;
        }
        System.out.println("Inverse of "+ n + " is: " + inverseNum);

        scanner.close();
    }
}
