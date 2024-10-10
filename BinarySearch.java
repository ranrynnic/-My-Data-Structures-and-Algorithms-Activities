import java.util.Arrays; // Import Array Class para array manipulation
import java.util.Scanner;// Diri kay para Scanner class para to take input from the user

// Binary Search Method
class BinarySearch{

    public static int binarySearch(int array[], int b) {
        int low = 0; // initialized from the starting index
        int high = array.length - 1;
	// ga looping akong idol
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (array[mid] == b)
                return mid;

            if (array[mid] < b)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return -1;
    }
	// main method sa akong idol
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
         //Pag input og size diri
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int array[] = new int[n];

        System.out.println("Enter " + n + " a number of elements: ");
        for (int a = 0; a < n; a++) {
            array[a] = sc.nextInt();
        }

        Arrays.sort(array);
        System.out.println("Array after entering the elements: " + Arrays.toString(array));

        System.out.print("Enter the target element to search: ");
        int b = sc.nextInt();
        //perform binary search
        int result = binarySearch(array, b);

        if (result == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index: " + result);
    }
}