import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

    // Method para perform ang Selection Sort ni boss amo
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // mo move ang unboundary for sorting
        for (int i = 0; i < n - 1; i++) {
            // ma ngita sa  minimum element nga wala unsorted part
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // mag swap sila sa element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input ang array size
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // create og specific na number
        int[] arr = new int[size];

        // e input  ang array elements
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // mo perform og sorted arrays
        selectionSort(arr);

        // Outtput sa sorted arrays
        System.out.println("Sorted array: " + Arrays.toString(arr));

       
    }
}