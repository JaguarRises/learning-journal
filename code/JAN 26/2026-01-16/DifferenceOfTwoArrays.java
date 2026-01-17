import java.util.Scanner;

public class DifferenceOfTwoArrays {

    public static void inputArray(int[] arr, int n, Scanner scanner){

        System.out.println("Enter the elements of the array: ");

        for(int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }
    }

    public static void displayArray(int[] arr, int n){
        System.out.println("The elements of the array are: ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void differenceOfTwoArrays(int[] arr1, int n1, int[] arr2, int n2){

        // assumption: arr2 > arr1 always

        int[] diffArray = new int[Math.max(n1, n2)];

        int i = n1 - 1;
        int j = n2 - 1;
        int k = diffArray.length - 1;
        int borrow = 0;

        while(j >= 0){  //While the bigger array has numbers left

            int val2 = arr2[j] - borrow;
            int val1 = (i >= 0)? arr1[i] : 0;   // arr2[] is the bigger array. If no number in arr1, put 0

            if(val2 < val1){
                val2 += 10;
                borrow = 1;
            }
            else{
                borrow = 0;
            }

            diffArray[k] = val2 - val1;

            i--;
            j--;
            k--;
        }

        int index = 0;
        for(int z = 0; z < diffArray.length; z++){
            if(diffArray[z] > 0){
                index = z;
                break;
            }
        }
        for(int p = index; p < diffArray.length; p++){
            System.out.print(diffArray[p] + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the first array: ");
        int n1 = scanner.nextInt();
        int[] arr1 = new int[n1];
        inputArray(arr1, n1, scanner);

        System.out.println("Enter the size of the second array: ");
        int n2 = scanner.nextInt();
        int[] arr2 = new int[n2];
        inputArray(arr2, n2, scanner);

        differenceOfTwoArrays(arr1, n1, arr2, n2);

        scanner.close();
    }

}
