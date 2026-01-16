import java.util.Scanner;

public class SumOfTwoArrays {

    public static void inputArray(int[] arr, int n){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the elements of the array: ");

        for(int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }
    }

    public static void displaySumArray(int[] arr, int n){
        // Not using in Pepcoding solution
        System.out.println("The elements of the array are: ");
        int index = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] > 0){
                index = i;
                break;
            }
        }
        for(int i = index; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void sumOfArray(int[] arr1, int n1, int[] arr2, int n2){

        int[] newArray = new int[Math.max(n1, n2)];
        int i = n1 - 1;
        int j = n2 - 1;
        int k = newArray.length - 1;

        int carryValue = 0;

        while(k >= 0){
            int sum = carryValue;
            if(i >= 0){
                sum += arr1[i];
            }

            if(j >= 0){
                sum += arr2[j];
            }

            newArray[k] = sum % 10;
            carryValue = sum / 10;

            i--;
            j--;
            k--;

        }

        if(carryValue > 0){
            System.out.print(carryValue + " ");
        }

        for(int val : newArray){
            System.out.print(val + " ");
        }
    }

/*  Very Complicated, lots of assumption. Doing it using PepCoding Solution
    public static int[] sumOfArray(int[] arr1, int n1, int[] arr2, int n2){
        int[] finalArray;
        int size = 0;
        int finalSize = 0;
        int remainingElements = 0;
        int[] remainingArr;
        if(n1 > n2){
            size = n1;
            finalSize = n1 + 1;
            remainingElements = n1 - n2;
            finalArray = new int[size];
            remainingArr = arr1;
        }
        else{
            size = n2;
            finalSize = n2 + 1;
            remainingElements = n2 - n1;
            finalArray = new int[size];
            remainingArr = arr2;
        }
        int temp1 = n1-1;
        int temp2 = n2-1;

        int carryValue = 0;

        while(temp1 >= 0 && temp2 >= 0){

            int sum = arr1[temp1] + arr2[temp2] + carryValue;
            carryValue = sum / 10;
            int digit = sum % 10;

            finalArray[size - 1] = digit;

            size--;
            temp1--;
            temp2--;
        }

        while(remainingElements > 0){

            int sum = remainingArr[remainingElements-1] + carryValue;
            int digit = sum % 10;
            carryValue = sum / 10;

            finalArray[size-1] = digit;
            size--;
            remainingElements--;
        }

        if(carryValue > 0){
            int[] newFinalArray = new int[finalSize];
            newFinalArray[0] = carryValue;
            for(int i = 1; i < finalSize ; i++){
                newFinalArray[i] = finalArray[i-1];
            }
            return newFinalArray;
        }

        return finalArray;
    }
*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the first array: ");
        int n1 = scanner.nextInt();

        int[] arr1 = new int[n1];
        inputArray(arr1, n1);

        System.out.println("Enter the size of the second array: ");
        int n2 = scanner.nextInt();

        int[] arr2 = new int[n2];
        inputArray(arr2, n2);
        sumOfArray(arr1, n1, arr2, n2);
/*
        int[] sumArray = sumOfArray(arr1, n1, arr2, n2);

        System.out.println("The sum of the elements of the two arrays is: ");
        displaySumArray(sumArray, sumArray.length);
*/
        scanner.close();
    }
}

/*  ChatGPT5.2 couldn't break my code, but says that this should be the correct code
import java.util.Scanner;

public class SumOfTwoArrays {

    public static void inputArray(int[] arr, Scanner sc) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static int[] sumOfArrays(int[] a, int[] b) {

        int i = a.length - 1;
        int j = b.length - 1;

        int[] sum = new int[Math.max(a.length, b.length) + 1];
        int k = sum.length - 1;

        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {

            int digit = carry;

            if (i >= 0) digit += a[i--];
            if (j >= 0) digit += b[j--];

            carry = digit / 10;
            sum[k--] = digit % 10;
        }

        return sum;
    }

    public static void displayArray(int[] arr) {

        int idx = 0;
        while (idx < arr.length && arr[idx] == 0) idx++;

        if (idx == arr.length) {
            System.out.print(0);
            return;
        }

        while (idx < arr.length) {
            System.out.print(arr[idx++] + " ");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        inputArray(arr1, sc);

        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        inputArray(arr2, sc);

        int[] result = sumOfArrays(arr1, arr2);
        displayArray(result);

        sc.close();
    }
}

*/
