import java.util.*;

public class RotateNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int noOfRotations = scanner.nextInt();

        if (num == 0) {
            // Avoiding Crash Cases
            System.out.println(0);
            return;
        }

        int temp = num;
        int countDigits = 0;

        while (temp != 0) {
            // Counting No. of Digits
            countDigits++;
            temp = temp / 10;
        }

        // Normalize k first
        noOfRotations = noOfRotations % countDigits;
        if (noOfRotations < 0) {
            // For Negative Rotations
            noOfRotations += countDigits;
        }

        if (noOfRotations == 0) {
            // No Rotation
            System.out.println(num);
            return;
        }

        // Not using Math.pow()
        int div = 1;
        for (int i = 1; i <= noOfRotations; i++) {
            div *= 10;
        }

        int right = num % div;  // Remainder
        int left = num / div;   // Divisor

        // To Shift Digits
        int multiplier = 1;
        for (int i = 1; i <= countDigits - noOfRotations; i++) {
            multiplier *= 10;
        }

        int rotatedNumber = right * multiplier + left;
        System.out.println(rotatedNumber);

        scanner.close();
    }
}
